package programmers.introduction;

import java.util.Arrays;

public class ArrayAverageTest {

    public static double solution(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double)sum / numbers.length;
    }

    public static void main(String[] args) {
        double result1 = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        double result2 = solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});

        System.out.println(result1);
        System.out.println(result2);
    }
}
