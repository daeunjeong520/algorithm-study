package programmers.level1;

/**
 * 두 정수 사이의 합
 */
public class SumOfGapNums {

    public static long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for(int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        long result1 = solution(3, 5);
        System.out.println(result1);

        long result2 = solution(3, 3);
        System.out.println(result2);

        long result3 = solution(5, 3);
        System.out.println(result3);
    }
}
