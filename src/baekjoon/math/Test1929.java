package baekjoon.math;

import java.io.*;

/**
 * 소수 구하기
 */
public class Test1929 {

    public static void gcd(int num){
        int count = 0;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count == 0 && num != 1){
            System.out.println(num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);

        for(int i = m; i <= n; i++) {
            gcd(i);
        }
    }
}
