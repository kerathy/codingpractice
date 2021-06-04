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
        System.out.println();

//
//        int[][] arr =
//                {
//                        {1, 1, 1, 0, 0, 0},
//                        {0, 1, 0, 0, 0, 0},
//                        {1, 1, 1, 0, 0, 0},
//                        {0, 0, 0, 0, 0, 0},
//                        {0, 0, 0, 0, 0, 0},
//                        {0, 0, 0, 0, 0, 0}
//
//                };
//        int res = maximumSum(arr);
//        System.out.println(res);
//
//
//            int[][] arr2 = {
//                    {1, 1, 1, 0, 0, 0},
//                    {0, 1, 0, 0, 0, 0},
//                    {1, 1, 1, 0, 0, 0},
//                    {0, 0, 2, 4, 4, 0},
//                    {0, 0, 0, 2, 0, 0},
//                    {0, 0, 1, 2, 4, 0}
//            };
//            int res2 = maximumSum(arr2);
//        System.out.println(res2);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }

//        System.out.println(Arrays.deepToString(arr3));
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
                res += arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
                res += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(res, max);
                res = 0;
            }
        }
        return max;
    }
}
