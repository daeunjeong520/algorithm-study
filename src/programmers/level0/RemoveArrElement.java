package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 배열의 원소 삭제하기
 */
public class RemoveArrElement {

    public static int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr) {
            list.add(num);
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        System.out.println(Arrays.toString(result1));
    }
}
