package baekjoon;

import java.util.Scanner;

/**
 * 피보나치 수 2(재귀 - 시간초과)
 */
public class Test2748 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a1 = 0, a2 = 1; // long type
        long result = 1;

        for(int i = 2; i <= n; i++) {
            result = a1 + a2;
            a1 = a2;
            a2 = result;
        }

        System.out.println(result);
    }
}
