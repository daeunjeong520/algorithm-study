package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 정수 내림차순으로 배치하기
 */
public class SortNumDescending {

    public static long solution(long n) {
        String[] split = String.valueOf(n).split("");
        Arrays.sort(split, Comparator.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for(String str: split) {
            sb.append(str);
        }
        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        long result1 = solution(118372);
        System.out.println(result1);
    }
}
