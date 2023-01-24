package programmers.introduction;

/**
 * 피자 나눠 먹기 (2) - n명이 모두 같은 조각 (6조각)
 */
public class DivisionPizzaTest2 {

    public static int solution(int n) {
        int gcd = 1;
        int max = Math.max(6, n);

        for(int i = 1; i <= max; i++) {
            if(6 % i == 0 && n % i == 0) gcd = i;
        }

        int commonMul = gcd * (6 / gcd) * (n / gcd);
        return commonMul / 6;
    }

    public static void main(String[] args) {

        int result1 = solution(6);
        int result2 = solution(10);
        int result3 = solution(4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
