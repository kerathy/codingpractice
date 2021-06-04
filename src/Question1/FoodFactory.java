package Question1;

import java.util.Scanner;

/**
 * @Title: FoodFactory
 * @Description: Practice
 * @Author:
 * @Version: 1.0
 * @create 6/4/21 10:05 AM
 */
public class FoodFactory {

    public static void main(String[] args) {
        System.out.println();
//        getFood("pizza");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        getFood(str);
    }

    public static Food getFood(String str) {
        if (str.equals("cake")) {
            System.out.println("The factory returned class Cake");
            System.out.println("Someone ordered a Dessert!");
            return new Cake();
        } else if (str.equals("pizza")){
            System.out.println("The factory returned class Pizza");
            System.out.println("Someone ordered Fast Food!");
            return new Pizza();
        }
        return null;
    }
}
