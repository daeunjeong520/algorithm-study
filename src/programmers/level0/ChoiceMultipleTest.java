package programmers.level0;

import java.util.Arrays;

/**
 * n의 배수 고르기
 */
public class ChoiceMultipleTest {

    public static int[] solution(int n, int[] numlist) {
        /*
        ArrayList<Integer> intArr = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) intArr.add(numlist[i]);
        }
        return intArr.stream().mapToInt(Integer::intValue).toArray();
        */
        return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        int[] result2 = solution(5, new int[]{1, 9, 3, 10, 13, 5});

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
