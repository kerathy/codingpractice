package Question1;

import java.util.Scanner;

/**
 * @Title: Question1
 * @Description: codingpractice0604
 * @Author:
 * @Version: 1.0
 * @create 6/4/21 6:46 PM
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.getFood(str);
    }
}
