package programmers.level1;

import java.util.Arrays;

/**
 * 최대공약수와 최소공배수
 */
public class GCDAndLCM {

    public static int[] solution(int n, int m) {
        int[] result = new int[2];
        int gcd = gcd(n, m);
        int lcm = lcm(n, m);
        result[0] = gcd;
        result[1] = lcm;

        return result;
    }

    public static int gcd(int a, int b) {
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int[] result1 = solution(3, 12);
        System.out.println(Arrays.toString(result1));

        int[] result2 = solution(2, 5);
        System.out.println(Arrays.toString(result2));
    }
}
