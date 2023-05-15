package programmers.level2;

/**
 * 숫자의 표현
 */
public class PresentationNumber {

    public static int solution(int n) {
        int count = 0;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j++) {
                sum += j;

                if(sum == n) {
                    count++;
                    sum = 0;
                    break;
                }else if(sum > n) {
                    break;
                }
            }
            sum = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(15);
        System.out.println(result1);
    }
}
