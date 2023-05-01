package programmers.level1;

/**
 * 나머지가 1이 되는 수 찾기
 */
public class RemainderOne {

    public static int solution(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int result1 = solution(10);
        System.out.println(result1);

        int result2 = solution(12);
        System.out.println(result2);
    }
}
