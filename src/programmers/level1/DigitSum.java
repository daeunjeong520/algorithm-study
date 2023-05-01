package programmers.level1;

/**
 * 자릿수 더하기
 */
public class DigitSum {

    public static int solution(int n) {
        int sum = 0;
        String[] split = String.valueOf(n).split("");
        for(int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = solution(123);
        System.out.println(result1);

        int result2 = solution(987);
        System.out.println(result2);
    }
}
