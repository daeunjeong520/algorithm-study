package programmers.level0;

import java.util.ArrayList;

/**
 * 짝수는 싫어요
 * 정수 n -> n 이하의 홀수가 오름차순으로 담긴 배열을 return
 */
public class DontLikeEvenNumTest {

    public static int[] solution(int n) {
        ArrayList<Integer> intArr = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                intArr.add(i);
            }
        }
        return intArr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution(10);
        int[] result2 = solution(15);

        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}