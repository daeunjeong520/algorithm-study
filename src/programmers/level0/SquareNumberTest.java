package programmers.level0;

/**
 * 제곱수 판별하기(12 * 12 = 144)
 */
public class SquareNumberTest {
    public static int solution(int n) {
        /*
        boolean isSquare = false;

        for(int i = 1; i <= 1000; i++) {
            if(i * i == n) isSquare = true;
        }
        if(isSquare) return 1;
        else return 2;
         */

        if(n % Math.sqrt(n) == 0) return 1;
        else return 2;
    }

    public static void main(String[] args) {
        int result1 = solution(144);
        int result2 = solution(976);

        System.out.println(result1);
        System.out.println(result2);
    }
}
