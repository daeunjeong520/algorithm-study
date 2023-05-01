package programmers.level1;

/**
 * 평균 구하기
 */
public class NumAvg {

    public static double solution(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum / arr.length;
    }

    public static void main(String[] args) {
        double result1 = solution(new int[]{1, 2, 3, 4});
        System.out.println(result1);

        double result2 = solution(new int[]{5, 5});
        System.out.println(result2);
    }
}
