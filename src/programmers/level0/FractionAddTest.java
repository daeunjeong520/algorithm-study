package programmers.level0;

public class FractionAddTest {

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int commonDenom = denom1 * denom2;
        numer1 = (commonDenom / denom1) * numer1;
        numer2 = (commonDenom / denom2) * numer2;

        int commonNumer = numer1 + numer2;

        int max = Math.max(commonDenom, commonNumer);

        int gcd = 1;
        for(int i = 1; i <= max; i++) {
            if(commonNumer % i == 0 && commonDenom % i == 0) {
                gcd = i;
            }
        }

        return new int[] {commonNumer / gcd, commonDenom / gcd};
    }

    public static void main(String[] args) {

        int[] result1 = solution(1, 2, 3, 4);
        int[] result2 = solution(9, 2, 1, 3);

        for (int i : result1) {
            System.out.print(i + " ");
        }

        for (int i : result2) {
            System.out.print(i + " ");
        }
    }
}
