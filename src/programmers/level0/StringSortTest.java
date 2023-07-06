package programmers.level0;

import java.util.Arrays;

/**
 * 문자열 정렬하기(2) - 문자열 모두 소문자로 변경 후 정렬
 */
public class StringSortTest {

    public static String solution(String my_string) {
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        String result1 = solution("Bcad");
        String result2 = solution("heLLo");
        String result3 = solution("Python");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}