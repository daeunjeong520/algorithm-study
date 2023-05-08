package programmers.level1;

import java.util.Arrays;
import java.util.Stack;

/**
 * 같은 숫자는 싫어
 */
public class HateSameNumber {

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            int peek = stack.peek();

            if(arr[i] != peek) {
                stack.push(arr[i]);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int[] result1 = solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(result1));

        int[] result2 = solution(new int[]{4, 4, 4, 3, 3});
        System.out.println(Arrays.toString(result2));
    }

}
