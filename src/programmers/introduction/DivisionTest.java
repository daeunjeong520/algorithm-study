package programmers.introduction;

/**
 * 두 수의 나눗셈 - 두 수를 나눈 값에 1,000 을 곱한 후 정수 부분을 return
 */
public class DivisionTest {

    public static int solution(int num1, int num2) {
        double answer = (double)num1 / num2 * 1000;
        return (int)answer;
    }

    public static void main(String[] args) {
        int result1 = solution(3, 2);
        int result2 = solution(7, 3);
        int result3 = solution(1, 16);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}