package baekjoon.math;

import java.io.*;

public class Test1934 {

    public static int gcd(int a, int b) {
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            bw.write(lcm(Integer.parseInt(str[0]), Integer.parseInt(str[1])) + "\n");
        }
        bw.close();
    }
}
