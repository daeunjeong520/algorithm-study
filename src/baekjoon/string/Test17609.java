package baekjoon.string;

import java.io.*;

/**
 * 회문(Palindrome)
 */
public class Test17609 {

    static String s;
    static char[] arr;

    public static boolean isPalindrome(int left, int right) {
        while(left <= right) {
            if(arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPseudoPalindrome(int left, int right) {
        while(left <= right) {
            if(arr[left] != arr[right]) {
                boolean b1 = isPalindrome(left + 1, right);
                boolean b2 = isPalindrome(left, right - 1);
                return b1 || b2;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            s = br.readLine();
            arr = s.toCharArray();

            int left = 0;
            int right = s.length()-1;

            if(isPalindrome(left, right)) {
                bw.write("0\n");
            }else if(isPseudoPalindrome(left, right)) {
                bw.write("1\n");
            }else {
                bw.write("2\n");
            }
        }
        bw.close();
    }
}
