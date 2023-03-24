package baekjoon.math;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 완전제곱수
 */
public class Test1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        ArrayList<Integer> min = new ArrayList<>();
        for(int i = m; i <= n; i++) {
            if(i % Math.sqrt(i) == 0) {
                sum += i;
                min.add(i);
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min.get(0));
        }
    }
}
