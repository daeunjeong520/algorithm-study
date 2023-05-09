package baekjoon.impl;

import java.util.Scanner;

/**
 * 팰린드롬인지 확인하기
 */
public class Test10988 {

    static String s;
    public static boolean isPalindrome(int left, int right) {
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        int left = 0;
        int right = s.length()-1;

        if(isPalindrome(left, right)) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
