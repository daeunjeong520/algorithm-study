package baekjoon.impl;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 서로 다른 부분 문자열의 개수
 */
public class Test11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i <= s.length(); i++) {
            for(int j = i+1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
