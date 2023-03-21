package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 소수
 */
public class Test2581 {

    public static boolean prime(int num) {
        if(num == 1) return false;

        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0, minPrime = m;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = m; i <= n; i++) {
            boolean isPrime = prime(i);
            if(isPrime) {
                sum += i;
                list.add(i);
            }
        }
        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum + "\n" + list.get(0));
        }
    }
}
