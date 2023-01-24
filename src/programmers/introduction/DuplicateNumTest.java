package programmers.introduction;

import java.util.Arrays;

/**
 * 중복된 숫자 개수
 */
public class DuplicateNumTest {

    /*
    public static int solution(int[] array, int n) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) count++;
        }
        return count;
    }
     */

    public static int solution(int[] array, int n) {
        return (int)Arrays.stream(array).filter(i -> i == n).count();
    }

    public static void main(String[] args) {

        int result1 = solution(new int[]{1, 1, 2, 3, 4, 5}, 1);
        int result2 = solution(new int[]{0, 2, 3, 4}, 1);

        System.out.println(result1);
        System.out.println(result2);

    }
}
