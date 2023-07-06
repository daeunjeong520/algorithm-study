package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문자열 정렬하기(1)
 */
public class SortStringTest {

    public static int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        char[] charArr = my_string.toCharArray();
        Arrays.sort(charArr);

        for(int i = 0; i < charArr.length; i++) {
            if(Character.isDigit(charArr[i])) {
                answer.add(Integer.parseInt(String.valueOf(charArr[i])));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution("hi12392");
        int[] result2 = solution("p2o4i8gj2");
        int[] result3 = solution("abcde0");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}