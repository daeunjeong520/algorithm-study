package programmers.level0;

import java.util.Arrays;

/**
 * 중앙값 구하기 (array 길이: 홀수)
 */
public class MedianValueTest {

    public static int solution(int[] array) {
       Arrays.sort(array);
       return array[array.length / 2];
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{1, 2, 7, 10, 11});
        int result2 = solution(new int[]{9, -1, 0});

        System.out.println(result1);
        System.out.println(result2);
    }
}