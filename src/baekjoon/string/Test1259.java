package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팰린드롬수
 */
public class Test1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();

            if(Integer.parseInt(s) == 0) {
                break;
            }
            if(isPalindrome(s)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }

    public static boolean isPalindrome(String s) {
        String[] split = s.split("");

        for(int i = 0; i < split.length/2; i++) {
            if(!split[i].equals(split[split.length-1-i])) {
                return false;
            }
        }
        return true;
    }
}
