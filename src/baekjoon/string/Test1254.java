package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬 만들기
 */
public class Test1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int answer = 0;
        for(int i = 0; i < str.length(); i++) {
            String sub = str.substring(i);
            if(isPalindrome(sub)) {
                answer = str.length() + i;
                break;
            }
        }
        System.out.println(answer);
    }

    public static boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
