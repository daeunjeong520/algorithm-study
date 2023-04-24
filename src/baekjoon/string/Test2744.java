package baekjoon.string;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();

        for(char ch: charArr) {
            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}
