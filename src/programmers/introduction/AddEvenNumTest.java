package programmers.introduction;

/**
 * 짝수의 합
 */
public class AddEvenNumTest {

    public static int solution(int n) {
        int sum = 0;

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = solution(10);
        int result2 = solution(4);

        System.out.println(result1);
        System.out.println(result2);
    }
}
