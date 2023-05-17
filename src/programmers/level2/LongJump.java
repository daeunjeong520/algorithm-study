package programmers.level2;

/**
 * 멀리뛰기
 */
public class LongJump {
    public static long solution(int n) {
        long[] dp = new long[2001];
        dp[1] = (long)1;
        dp[2] = (long)2;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        long result1 = solution(2000);
        System.out.println(result1);

        long result2 = solution(3);
        System.out.println(result2);
    }
}
