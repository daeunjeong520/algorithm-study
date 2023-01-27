package programmers.introduction;

/**
 * 합성수 찾기
 */
public class CompositionNumberTest {

    public static int solution(int n) {
        int answer = 0;

        for(int i = 4; i <= n; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) count++;
            }
            if(count >= 3) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        int result1 = solution(10);
        int result2 = solution(15);

        System.out.println(result1);
        System.out.println(result2);
    }
}
