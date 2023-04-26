package baekjoon.impl;

import java.util.HashSet;
import java.util.Scanner;

public class Test3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = 10;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < t; i++) {
            set.add(sc.nextInt() % 42);
        }
        System.out.println(set.size());
    }
}
