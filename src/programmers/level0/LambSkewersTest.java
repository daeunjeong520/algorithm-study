package programmers.level0;

/**
 * 10인분 -> 음료수 하나 서비스
 * 양꼬치 1인분 -> 12000원, 음료수 하나 -> 2000원
 * return 총 지불 금액
 */
public class LambSkewersTest {

    public static int solution(int n, int k) {
        int service = n / 10;
        return n * 12000 + (k - service) * 2000;
    }

    public static void main(String[] args) {

        int result1 = solution(10, 3);
        int result2 = solution(64, 6);

        System.out.println(result1);
        System.out.println(result2);
    }
}
