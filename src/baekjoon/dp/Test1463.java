package baekjoon.dp;

import java.util.Scanner;

/**
 * 1로 만들기
 */
public class Test1463 {

    public static int solution(int n) {
        int[] dp = new int[n+1];

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + 1;

            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
