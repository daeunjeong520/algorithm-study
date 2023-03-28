package baekjoon.math;

import java.util.Scanner;

public class Test1699 {

    public static int sqrt(int n) {
        return (int)Math.sqrt(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int i = (int)Math.sqrt(n);
        while(n > 0) {

            if(n < i) {
                i--;
            }else {
                count++;
                n -= i*i;
            }
        }
        System.out.println(count);
    }
}
