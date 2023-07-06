package programmers.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 최빈값 구하기
 */
public class MaxCountVal {

    public static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxVal = Collections.max(map.values());
        int count = 0;
        int answer = 0;

        for(int key: map.keySet()) {
            if(map.get(key) == maxVal) {
                ++count;
                answer = key;
            }
        }
        if(count > 1) {
            return -1;
        }else {
            return answer;
        }
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{1, 2, 3, 3, 3, 4});
        System.out.println(result1);

        int result2 = solution(new int[]{1, 1, 2, 2});
        System.out.println(result2);

        int result3 = solution(new int[]{1});
        System.out.println(result3);
    }
}
