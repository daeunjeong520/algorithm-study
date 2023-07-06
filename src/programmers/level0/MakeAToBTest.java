package programmers.level0;

import java.util.Arrays;

/**
 * A로 B 만들기 - sort
 */
public class MakeAToBTest {

    public static int solution(String before, String after) {
        /*
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        if(Arrays.equals(beforeArr, afterArr)) return 1;
        else return 0;
         */
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 : 0;
    }

    public static void main(String[] args) {

        int result1 = solution("olleh", "hello");
        int result2 = solution("allpe", "apple");

        System.out.println(result1);
        System.out.println(result2);
    }
}
