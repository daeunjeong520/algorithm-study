package baekjoon.math;

import java.util.Scanner;

/**
 * 오븐 시계
 */
public class Test2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = b + c;
        while(min > 59) {
            min -= 60;
            a += 1;
        }
        if(a > 23) {
            a -= 24;
        }
        System.out.println(a + " " + min);
    }
}
