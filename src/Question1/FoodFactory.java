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

    public Food getFood(String str) {
        if (str.equals("cake")) {
            Food food = new Cake();
            String type = food.getType();
            System.out.println("The factory returned class " + food.getClass().getName().split("\\.")[1]);
            System.out.println(type);
            return food;
        } else if (str.equals("pizza")){
            Food food = new Pizza();
            String type = food.getType();
            System.out.println("The factory returned class " + food.getClass().getName().split("\\.")[1]);
            System.out.println(type);
            return food;
        }
        return null;
    }
}
