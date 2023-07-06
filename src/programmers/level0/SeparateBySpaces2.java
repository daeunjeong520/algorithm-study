package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 공백으로 구분하기 2
 */
public class SeparateBySpaces2 {

    public static String[] solution(String my_string) {
        String[] split = my_string.split(" ");
        List<String> list = new ArrayList<>();

        for(String str: split) {
            if(!str.equals("")) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] result1 = solution("i  love you");
        System.out.println(Arrays.toString(result1));

        String[] result2 = solution("   programmers");
        System.out.println(Arrays.toString(result2));
    }
}
