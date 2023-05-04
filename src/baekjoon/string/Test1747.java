package baekjoon.string;

import java.util.Scanner;

public class Test1747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isContinue = true;
        int i = n;
        while(isContinue) {

            if(isPalindrome(String.valueOf(i)) && isPrime(i)) {
                System.out.println(i);
                isContinue = false;
                break;
            }

            i++;
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
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
