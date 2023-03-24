package baekjoon.math;

import java.util.Scanner;

/**
 * 최대공약수와 최소공배수
 */
public class Test2609 {

    public static int gcd(int a, int b) {
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        int lcm = lcm(a, b);

        System.out.print(gcd + "\n" + lcm + "\n");

    }
}
