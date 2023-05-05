package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 가장 긴 증가하는 부분 수열
 */
public class Test11053 {

    public static int solution(int[] arr) {
        int[] dp = new int[arr.length+1];
        int n = arr.length;
        int result = 0;

        for(int i = 0; i <= n; i++) {
            dp[i] = 1;
            for(int j = 1; j < i; j++) {
                if(arr[j-1] < arr[i-1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(dp[i], result);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[t];
        String[] split = br.readLine().split(" ");

        for(int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int answer = solution(arr);
        System.out.println(answer);
    }
}
