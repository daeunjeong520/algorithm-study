package baekjoon.greedy;

import java.util.Scanner;

/**
 * 거스름돈
 */
public class Test14916 {

    public static int solution(int n) {

        int count = 0;

        while(n > 0) {
            if(n % 5 == 0) {
                count += n / 5;
                n %= 5;
            }else {
                count++;
                n -= 2;
            }
        }
        if(n < 0) {
            return -1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = solution(n);
        System.out.println(result);
    }
}
