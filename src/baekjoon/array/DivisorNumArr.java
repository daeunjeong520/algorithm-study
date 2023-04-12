package baekjoon.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 나누어 떨어지는 수
 */
public class DivisorNumArr {
    public static void main(String[] args) {
        int[] result1 = solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(result1));
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                result.add(arr[i]);
            }
        }
        Collections.sort(result);

        if(result.size() == 0) {
            return new int[]{-1};
        }else {
            return result.stream().mapToInt(Integer::intValue).toArray();
        }

    }
}
