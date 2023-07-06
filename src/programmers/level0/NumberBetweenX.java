package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * x 사이의 개수
 */
public class NumberBetweenX {

    public static int[] solution(String myString) {
        String[] split = myString.split("x");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < split.length; i++) {
            list.add(split[i].length());
        }

        if(myString.endsWith("x")) {
            list.add(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution("oxooxoxxox");
        System.out.println(Arrays.toString(result1));

        int[] result2 = solution("xabcxdefxghi");
        System.out.println(Arrays.toString(result2));
    }
}
