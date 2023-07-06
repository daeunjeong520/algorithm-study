package programmers.level0;

import java.util.*;

/**
 * 배열 자르기 (Arrays.copyOfRange())
 */
public class CuttingArrayTest {

    /*
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] newArr = new int[num2 - num1 + 1];
        int i = 0;
        for(int j = num1; j <= num2; j++) {
            newArr[i] = numbers[j];
            i++;
        }
        return newArr;
    }
    */
    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args) {

        int[] result1 = solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
        int[] result2 = solution(new int[]{1, 3, 5}, 1, 2);

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