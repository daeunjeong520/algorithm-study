package baekjoon.math;

import java.util.Scanner;

/**
 * 소인수분해
 */
public class Test11653 {

    public static void printPrime(int n) {
        int i = 2;
        while(n > 0) {
            if(n == 1) return;
            if(n % i == 0) {
                System.out.println(i);
                n /= i;
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);
    }
}