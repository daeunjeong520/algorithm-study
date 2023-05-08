package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 */
public class RemoveSmallestNum {

    public static int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] != min) {
                list.add(arr[i]);
            }
        }
        if(list.size() == 0) {
            return new int[] {-1};
        }else {
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        int[] result1 = solution(new int[]{4, 3, 2, 1});
        System.out.println(Arrays.toString(result1));

        int[] result2 = solution(new int[]{10});
        System.out.println(Arrays.toString(result2));
    }
}
