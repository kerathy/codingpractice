package Question6;

import java.util.Scanner;

/**
 * @Title: HourGlass
 * @Description: Practice
 * @Author:
 * @Version: 1.0
 * @create 6/4/21 11:06 AM
 */
public class HourGlass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[][] arr3 = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }

        int res3 = maximumSum(arr3);
        System.out.println(res3);
    }

    public static int maximumSum(int[][] arr) {
        int len = arr.length, max = Integer.MIN_VALUE, res = 0;
//        System.out.println(len);
//        for (int i = 2; i + 2 < len; i++) {
//            System.out.println(i);
//            int j = 1;
//            System.out.println("j" + j);
//            System.out.println("j:" + (j + 1));
//            System.out.println("j:" + (j + 2));
//        }

        for (int i = 0; i + 2 < len; i++) {
            for (int j = 0; j + 2 < len; j++) {
                res += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                res += arr[i + 1][j + 1];
                res += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(res, max);
                res = 0;
            }
        }
        return max;
    }
}
