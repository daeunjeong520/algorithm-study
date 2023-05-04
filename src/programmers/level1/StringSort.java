package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 문자열 내림차순으로 배치하기
 */
public class StringSort {

    public static String solution(String s) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        list.sort(Comparator.reverseOrder());

        StringBuffer sb = new StringBuffer();
        for(String ele: list) {
            sb.append(ele);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result1 = solution("Zbcdefg");
        System.out.println(result1);
    }
}
