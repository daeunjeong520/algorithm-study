package programmers.level0;

import java.util.*;

/**
 * 삼각형의 완성 조건 (1) - 가장 긴변의 길이는 다른 두변의 길이의 합보다 작아야 함
 */
public class CompleteTriangleTest {

    /*
    public static int solution(int[] sides) {

        int max = 0, sum = 0;

        for(int i = 0; i < sides.length; i++) {
            if(max < sides[i]) max = sides[i];
            sum += sides[i];
        }

        if(sum - max > max) {
            return 1;
        }else {
            return 2;
        }
    }
     */

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[1] + sides[0] ? 1 : 2;
    }


    public static void main(String[] args) {

        int result1 = solution(new int[]{1, 2, 3});
        int result2 = solution(new int[]{3, 6, 2});
        int result3 = solution(new int[]{199, 72, 222});

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
