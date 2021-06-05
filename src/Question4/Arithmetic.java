package Question4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title: Arithmetic
 * @Description: Practice
 * @Author:
 * @Version: 1.0
 * @create 6/4/21 10:44 AM
 */
public class Arithmetic {

    public static int add(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res += num;
        }
        return res;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String res = adder.getClass().getSuperclass().getName();
        System.out.println("My superclass is: " + res.split("\\.")[1]);

        String strRes = "";
        for (int i = 0; i < n; i++) {
            int arrSize = sc.nextInt();
            int[] nums = new int[arrSize];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = sc.nextInt();
            }
            int sum = adder.add(nums);
            strRes += sum + " ";
        }
        System.out.println(strRes);
    }
}
