package programmers.level1;

import java.util.Arrays;

/**
 * 자연수 뒤집어 배열로 만들기
 */
public class ReverseNumArray {

    public static int[] solution(long n) {
        String[] split = String.valueOf(n).split("");
        int[] arr = new int[split.length];

        for(int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[split.length-1-i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] result1 = solution(12345);
        System.out.println(Arrays.toString(result1));
    }
}