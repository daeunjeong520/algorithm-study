package programmers.level0;

import java.util.Arrays;

/**
 * 최댓값 만들기(2)
 */
public class MakeMaxValueTest2 {

    public static int solution(int[] numbers) {
        int[] minusNum = new int[2];
        Arrays.sort(numbers); // -5, -3, 1, 2, 4

        int minusMax = numbers[0] * numbers[1];
        int plusMax = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return Math.max(minusMax, plusMax);
    }

    public static void main(String[] args) {

        int result1 = solution(new int[]{1, 2, -3, 4, -5});
        int result2 = solution(new int[]{0, -31, 24, 10, 1, 9});
        int result3 = solution(new int[]{10, 20, 30, 5, 5, 20, 5});

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
