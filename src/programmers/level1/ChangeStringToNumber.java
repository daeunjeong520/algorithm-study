package programmers.level1;

/**
 * 문자열을 정수로 바꾸기
 */
public class ChangeStringToNumber {

    public static int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int result1 = solution("1234");
        System.out.println(result1);

        int result2 = solution("-1234");
        System.out.println(result2);
    }
}
