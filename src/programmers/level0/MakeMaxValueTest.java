package programmers.level0;

import java.util.Arrays;

/**
 * 최댓값 만들기 (1) - 두 수 곱해서
 */
public class MakeMaxValueTest {

    /*
    public static int solution(int[] numbers) {
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 1; j < numbers.length; j++) {
                if(max < numbers[i] * numbers[j] && i != j) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
    }
    */

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }

    public static void main(String[] args) {

        int result1 = solution(new int[]{1, 2, 3, 4, 5});
        int result2 = solution(new int[]{0, 31, 24, 10, 1, 9});

        System.out.println(result1);
        System.out.println(result2);
    }
}
