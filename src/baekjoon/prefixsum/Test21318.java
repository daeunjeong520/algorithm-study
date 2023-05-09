package baekjoon.prefixsum;

import java.io.*;

/**
 * 피아노 체조
 */
public class Test21318 {
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

        for(int i = 1; i <= n; i++) {
            if(numArr[i] < numArr[i-1]) {
                sumArr[i] = sumArr[i-1] + 1;
            }else {
                sumArr[i] = sumArr[i-1];
            }
        }

        int q = Integer.parseInt(br.readLine());
        for(int i = 0; i < q; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            int result = sumArr[y] - sumArr[x];

            bw.write(result + "\n");
        }
        bw.close();
    }
}
