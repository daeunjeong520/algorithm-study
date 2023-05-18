package programmers.level2;

import java.util.Arrays;

/**
 * 카펫
 */
public class Carpet {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int S = brown + yellow;

        for(int height = 3; height < S; height++) {
            int width = S / height;

            if(width >= height) {
                if((width-2) * (height-2) == yellow && (S - yellow) == brown) {
                    answer[0] = width;
                    answer[1] = height;
                }
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result1 = solution(24, 24);
        System.out.println(Arrays.toString(result1));
    }
}
