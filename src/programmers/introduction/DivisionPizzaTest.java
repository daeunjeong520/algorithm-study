package programmers.introduction;

/**
 * 피자 나눠먹기 - 사람수 n
 */
public class DivisionPizzaTest {

    public static int solution(int n) {
        if(n % 7 == 0) return n / 7;
        else return n / 7 + 1;
    }

    public static void main(String[] args) {

        int result1 = solution(7);
        int result2 = solution(1);
        int result3 = solution(15);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
