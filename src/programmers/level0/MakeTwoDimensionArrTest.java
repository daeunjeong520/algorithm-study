package programmers.level0;

/**
 * 2차원으로 만들기
 */
public class MakeTwoDimensionArrTest {

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int k = 0;
        for(int i = 0; i < num_list.length/n; i++) { // 0 ~ 3
            for(int j = 0; j < n; j++) { // 0 ~ 1
                answer[i][j] = num_list[k];
                k++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] result1 = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        int[][] result2 = solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3);

        for (int[] ints : result1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] ints : result2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
