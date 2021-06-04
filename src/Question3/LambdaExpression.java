package Question3;

import java.util.Scanner;

/**
 * @Title: LambdaExpression
 * @Description: Practice
 * @Author:
 * @Version: 1.0
 * @create 6/4/21 10:21 AM
 */
public class LambdaExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(n);
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
//            System.out.println("a:" + a + "b:" + b);
            if (a == 1) {
                String res = isOdd(b);
                System.out.println(res);
            } else if (a == 2) {
                String res = isPrime(b);
                System.out.println(res);
            } else if (a == 3) {
                String res = isPalindrome(b);
                System.out.println(res);
            }
        }

    }

    public static String isOdd(int num) {
        return num % 2 == 0 ? "EVEN" : "ODD";
    }

    public static String isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "COMPOSITE";
            }
        }
        return "Prime";
    }

    public static String isPalindrome(int n) {
//        StringBuilder sb = new StringBuilder();
//
//        String newStr = new StringBuffer().append(String.valueOf(n).toCharArray()).reverse().toString();
//        System.out.println(newStr);
        return (new StringBuffer().append(String.valueOf(n).toCharArray()).reverse().toString()).equals(String.valueOf(n)) ? "isPalindrome" : "";
//        for (int i = chars.length - 1; i >= 0; i--) {
//            sb.append(chars[i]);
//        }
//        return original.equals(sb.toString()) ? "isPalindrome" : "";

//        return newStr.equals(String.valueOf(n)) ? "isPalindrome" : "";
    }
}
