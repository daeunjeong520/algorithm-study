package programmers.introduction;

/**
 * 나머지 구하기
 */
public class RemainderTest {
    public static int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }

    public static void main(String[] args) {
        int solution1 = solution(3, 2);
        System.out.println(solution1);

        int solution2 = solution(10, 5);
        System.out.println(solution2);
    }
}
