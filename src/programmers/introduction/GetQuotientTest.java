package programmers.introduction;

/**
 * 몫 구하기
 */
public class GetQuotientTest {

    public static int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

    public static void main(String[] args) {

        int result1 = solution(10, 5);
        int result2 = solution(7, 2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
