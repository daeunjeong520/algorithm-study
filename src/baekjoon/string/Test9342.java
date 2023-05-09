package baekjoon.string;

import java.io.*;

public class Test9342 {

    public static String solution(String s) {
        String regex = "^[A-F]?A+F+C+[A-F]?$";
        if(s.matches(regex)) {
            return "Infected!";
        }else {
            return "Good";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String result = solution(br.readLine());
            bw.write(result + "\n");
        }
        bw.close();
    }
}
