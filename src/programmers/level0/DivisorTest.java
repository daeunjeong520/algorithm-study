package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 약수 테스트
 */
public class DivisorTest {

    public static int[] solution(int n) {
        ArrayList<Integer> numArr = new ArrayList<>();
        for(int i = 1; i<=n; i++) {
            if(n % i == 0) numArr.add(i);
        }
        return numArr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution(24);
        int[] result2 = solution(29);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
