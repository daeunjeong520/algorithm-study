package programmers.level1;

import java.util.ArrayList;

/**
 * 없는 숫자 더하기
 */
public class MissingNumberSum {

    /*
    public static int solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0; i <= 9; i++) {
            list.add(i);
        }

        for(int i = 0; i < numbers.length; i++) {
            list2.add(numbers[i]);
        }
        list.removeAll(list2);

        int answer = 0;
        for(int num: list) {
            answer += num;
        }
        return answer;
    }
     */

    public static int solution(int[] numbers) {
        int sum = 45;
        for(int num: numbers) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
        System.out.println(result1);

        int result2 = solution(new int[]{5, 8, 4, 0, 6, 7, 9});
        System.out.println(result2);
    }
}
