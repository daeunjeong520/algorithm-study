package programmers.level2;

import java.util.Arrays;

/**
 * 다음 큰 숫자
 */
public class NextBigNumber {

    public static int solution(int n) {
        int nCount = getOneCount(n);

        for(int i = n+1; i < 1000000; i++) {
            int oneCount = getOneCount(i);
            if(nCount == oneCount) {
                return i;
            }
        }
        return 0;
    }

    public static int getOneCount(int n) {
        int one = 1;

        while(n > 1) {
            if(n % 2 == 1) {
                one++;
            }
            n /= 2;
        }
        return one;
    }

    public static void main(String[] args) {
        int result1 = solution(78);
        System.out.println(result1);

        int result2 = solution(15);
        System.out.println(result2);
    }
}
