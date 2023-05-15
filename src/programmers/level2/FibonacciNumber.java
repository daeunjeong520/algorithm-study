package programmers.level2;

/**
 * 피보나치 수
 */
public class FibonacciNumber {

    public static int solution(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int result1 = solution(3);
        System.out.println(result1);

        int result2 = solution(5);
        System.out.println(result2);
    }
}
