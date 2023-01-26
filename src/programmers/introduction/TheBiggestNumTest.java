package programmers.introduction;

import java.util.Arrays;

/**
 * 가장 큰 수 찾기 - 가장 큰 수와 인덱스
 */
public class TheBiggestNumTest {

    public static int[] solution(int[] array) {
        int[] newArr = array.clone();
        Arrays.sort(array);

        int maxIdx = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[array.length-1] == newArr[i]) maxIdx = i;
        }

        return new int[] {array[array.length-1], maxIdx};
    }

    public static void main(String[] args) {

        int[] result1 = solution(new int[]{1, 8, 3});
        int[] result2 = solution(new int[]{9, 10, 11, 8});

        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
