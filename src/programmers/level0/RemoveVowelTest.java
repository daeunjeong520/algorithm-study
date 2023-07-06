package programmers.level0;

/**
 * 모음 제거 - replaceAll() - 정규표현식
 */
public class RemoveVowelTest {
    public static String solution(String my_string) {
        return my_string.replaceAll("a|o|e|u|i", "");
    }

    public static void main(String[] args) {
        String result1 = solution("bus");
        String result2 = solution("nice to meet you");

        System.out.println(result1);
        System.out.println(result2);
    }
}