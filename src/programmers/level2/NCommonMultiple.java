package programmers.level2;

/**
 * N개의 최소공배수
 */
public class NCommonMultiple {

    public static int solution(int[] arr) {
        int result = lcm(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
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
        int result1 = solution(new int[]{2, 6, 8, 14});
        System.out.println(result1);

        int result2 = solution(new int[]{1, 2, 3});
        System.out.println(result2);
    }
}