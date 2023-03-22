package baekjoon.math;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 약수 구하기
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 약수 구하기
 */
public class Test2501 {

    public static ArrayList<Integer> divisor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> divisor = divisor(n);
        if(divisor.size() < k) {
            System.out.println(0);
        }else {
            System.out.println(divisor.get(k-1));
        }
    }
}