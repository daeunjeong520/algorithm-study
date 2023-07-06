package programmers.level0;

import java.util.Arrays;

/**
 * 배열 두배 만들기
 */
public class ArrayDoubleNumTest {

    /*
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i< numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
    */

    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(num -> num * 2).toArray();
    }

    public static void main(String[] args) {

        int[] result1 = solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = solution(new int[]{1, 2, 100, -99, 1, 2, 3});

        for(int num: result1) {
            System.out.print(num + " ");
        }
    }
}
