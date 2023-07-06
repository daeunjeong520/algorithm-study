package programmers.level0;

import java.util.Arrays;

/**
 * 정수를 나선형으로 배치하기
 */
public class NumSpiralArrangement {

    public static int[][] solution(int n) {
        int[][] arr = new int[n][n]; // 0 ~ 4
        int num = 1;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n-1;
        int colEnd = n-1;

        while(num <= n*n) { // 1 ~ 25
            // 왼쪽 -> 오른쪽
            for(int i = colStart; i <= colEnd; i++) {
                arr[rowStart][i] = num++;
            }
            rowStart++;

            // 위쪽 -> 아래쪽
            for(int i = rowStart; i <= rowEnd; i++) {
                arr[i][colEnd] = num++;
            }
            colEnd--;

            // 오른쪽 -> 왼쪽
            for(int i = colEnd; i >= colStart; i--) {
                arr[rowEnd][i] = num++;
            }
            rowEnd--;

            // 아래쪽 -> 위쪽
            for(int i = rowEnd; i >= rowStart; i--) {
                arr[i][colStart] = num++;
            }
            colStart++;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] result1 = solution(5);
        System.out.println(Arrays.deepToString(result1));
    }
}
