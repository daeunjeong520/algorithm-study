package programmers.level1;

import java.util.Arrays;

/**
 * 자연수 뒤집어 배열로 만들기
 */
public class ReverseStringToArray {

    public static int[] solution(long n) {
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        StringBuffer reverse = sb.reverse();

        String[] split = reverse.toString().split("");

        int[] numArr = new int[reverse.length()];
        for(int i = 0; i < reverse.length(); i++) {
            numArr[i] = Integer.parseInt(split[i]);
        }
        return numArr;
    }

    public static void main(String[] args) {
        int[] result1 = solution(12345);
        System.out.println(Arrays.toString(result1));
    }
}
