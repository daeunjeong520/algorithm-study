package programmers.level1;

import java.util.Arrays;

/**
 * 예산
 */
public class Budget {

    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;

        int index = 0;
        while(index <= d.length-1) {
            if(d[index] <= budget) {
                count++;
                budget -= d[index];
            }
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println(result1);

        int result2 = solution(new int[]{2, 2, 3, 3}, 10);
        System.out.println(result2);
    }
}
