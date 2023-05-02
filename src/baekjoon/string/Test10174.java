package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬
 */
public class Test10174 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < t; i++) {
            boolean isPalindrome = isPalindrome(br.readLine());
            if(isPalindrome) {
                sb.append("Yes\n");
            }else {
                sb.append("No\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isPalindrome(String s) {
        String[] split = s.split("");
        for(int i = 0; i < split.length/2; i++) {
            if(!split[i].equalsIgnoreCase(split[split.length-1-i])) {
                return false;
            }
        }
        return true;
    }
}