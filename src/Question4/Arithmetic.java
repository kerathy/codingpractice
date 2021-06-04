package Question4;

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
//        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        int[] nums = {1, 2, 3};
        if (adder instanceof Adder) {
            System.out.println("My superclass is: Arithmetic");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
//        System.out.println("sum: " + adder.add(nums));

    }
}
