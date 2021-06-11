package Question3;

import java.util.ArrayList;
import java.util.List;
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
        List<String> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 1) {
                res.add(checkOperation(LambdaExpression.isOdd(), b) ? "EVEN" : "ODD");
            } else if (a == 2) {
                res.add(checkOperation(LambdaExpression.isPrime(), b) ? "PRIME" : "COMPOSITE");
            } else if (a == 3) {
                res.add(checkOperation(LambdaExpression.isPalindrome(), b) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        for (String str : res) {
            System.out.println(str);
        }
    }

    public static boolean checkOperation(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return n -> n % 2 == 0;
    }

    public static PerformOperation isPrime() {
        return n -> java.math.BigInteger.valueOf(n).isProbablePrime(100);
    }

    public static PerformOperation isPalindrome() {
        return  n -> (new StringBuffer().append(String.valueOf(n).toCharArray()).reverse().toString()).equals(String.valueOf(n));
    }
}
