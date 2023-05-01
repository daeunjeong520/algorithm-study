package programmers.level1;

/**
 * 정수 제곱근 판별
 */
public class SquareRoot {

    public static long solution(long n) {
        long answer = -1;

        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(Math.pow(i, 2) == n) {
                answer = (long)Math.pow(i+1, 2);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        long result1 = solution(121);
        System.out.println(result1);

        long result2 = solution(3);
        System.out.println(result2);
    }
}
