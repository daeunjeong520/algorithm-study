package baekjoon.math;

import java.io.*;

/**
 * GCD 합
 */
public class Test9613 {

    public static int gcd(int a, int b) {
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            String[] str = br.readLine().split(" ");
            long sum = 0;

            for(int j = 1; j < str.length-1; j++) {
                for(int k = j + 1; k < str.length; k++) {
                    sum += gcd(Integer.parseInt(str[j]), Integer.parseInt(str[k]));
                }
            }
            bw.write(sum + "\n");
        }
        bw.close();
    }
}
