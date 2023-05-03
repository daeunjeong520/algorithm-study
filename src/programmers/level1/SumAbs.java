package programmers.level1;

/**
 * 음양 더하기
 */
public class SumAbs {

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(!signs[i]) {
                absolutes[i] = -absolutes[i];
            }
            sum += absolutes[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
        System.out.println(result1);

        int result2 = solution(new int[]{1, 2, 3}, new boolean[]{false, false, true});
        System.out.println(result2);
    }
}
