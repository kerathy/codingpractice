package Question2;

import java.util.Scanner;

/**
 * @Title: Singleton
 * @Description: Practice
 * @Author:
 * @Version: 1.0
 * @create 6/4/21 10:13 AM
 */
public class Singleton {

    private Singleton() {
    }

    public String named;

    public static Singleton getSingleInstance() {
        return new Singleton();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(str);
        Singleton singleton = getSingleInstance();
        if (singleton instanceof Singleton) {
            System.out.println("Hello I am a singleton! Let me say " + str + " to you");
        }
    }
}
