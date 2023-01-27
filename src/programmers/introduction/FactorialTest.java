package programmers.introduction;

/**
 * 팩토리얼
 */
public class FactorialTest {

    public static int factorial(int n) {
        if(n <= 1) return n;
        else return n * factorial(n-1);
    }

    public static int solution(int n) {
        int i = 1;
        int answer = 0;

        while(factorial(i) <= n) {
            answer = i;
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result1 = solution(3628800);
        int result2 = solution(7);

        System.out.println(result1);
        System.out.println(result2);
    }
}
