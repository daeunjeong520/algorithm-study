package programmers.level0;

import java.util.Arrays;

/**
 * 공백으로 구분하기
 */
public class SeparateBySpaces {

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        String[] result1 = solution("i love you");
        System.out.println(Arrays.toString(result1));

        String[] result2 = solution("programmers");
        System.out.println(Arrays.toString(result2));
    }
}
