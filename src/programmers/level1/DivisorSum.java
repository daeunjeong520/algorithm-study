package programmers.level1;

/**
 * 약수의 합
 */
public class DivisorSum {

    public static int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = solution(12);
        System.out.println(result1);

        int result2 = solution(5);
        System.out.println(result2);
    }
}
