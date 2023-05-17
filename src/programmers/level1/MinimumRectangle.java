package programmers.level1;

/**
 * 최소 직사각형
 */
public class MinimumRectangle {

    public static int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for(int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            if(maxW < max) {
                maxW = max;
            }
            if(maxH < min) {
                maxH = min;
            }
        }
        return maxW * maxH;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println(result1);
    }
}
