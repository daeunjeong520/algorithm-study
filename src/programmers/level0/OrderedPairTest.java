package programmers.level0;

import java.util.stream.IntStream;

/**
 * 순서쌍의 개수 - IntStream.rangeClosed(1, n) - 1부터 n까지 순회
 */
public class OrderedPairTest {

    /*
    public static int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) count++;
        }
        return count;
    }
     */

    public static int solution(int n) {
        return (int)IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

    public static void main(String[] args) {

        int result1 = solution(20);
        int result2 = solution(100);

        System.out.println(result1);
        System.out.println(result2);
    }
}