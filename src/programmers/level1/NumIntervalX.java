package programmers.level1;

import java.util.Arrays;

/**
 * x만큼 간격이 있는 n개의 숫자
 */
public class NumIntervalX {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        long temp = (long)x;
        for(int i = 0; i < n; i++) {
            answer[i] = temp;
            temp += (long)x;
        }
        return answer;
    }

    public static void main(String[] args) {
        long[] result1 = solution(2, 5);
        System.out.println(Arrays.toString(result1));

        long[] result2 = solution(4, 3);
        System.out.println(Arrays.toString(result2));

        long[] result3 = solution(-10000000, 1000);
        System.out.println(Arrays.toString(result3));
    }
}
