package baekjoon.prefixsum;

import java.io.*;

/**
 * 합 구하기
 */
public class Test11441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] numArr = new int[n+1];
        int[] sumArr = new int[n+1];

        String[] split = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            numArr[i+1] = Integer.parseInt(split[i]);
        }

        sumArr[1] = numArr[1];
        for(int i = 2; i <= n; i++) {
            sumArr[i] = sumArr[i-1] + numArr[i];
        }

        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int result = sumArr[b] - sumArr[a - 1];

            bw.write( result+ "\n");
        }
        bw.close();
    }
}
