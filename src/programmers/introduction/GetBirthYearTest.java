package programmers.introduction;

/**
 * 나이가 주어졌을 때 -> 출생 연도 구하기 (2022년 기준)
 */
public class GetBirthYearTest {

    public static int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }


    public static void main(String[] args) {
        int result1 = solution(40);
        int result2 = solution(23);

        System.out.println(result1);
        System.out.println(result2);
    }
}
