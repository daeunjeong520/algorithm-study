package programmers.level0;

/**
 * 배열 뒤집기
 */
public class ReverseArrayTest {

    public static int[] solution(int[] num_list) {
        int[] newNumList = new int[num_list.length];
        int j = 0;
        for(int i = num_list.length - 1; i >= 0; i--) {
            newNumList[j] = num_list[i];
            j++;
        }
        return newNumList;
    }

    public static void main(String[] args) {

        int[] result1 = solution(new int[] {1, 2, 3, 4, 5});
        int[] result2 = solution(new int[] {1, 1, 1, 1, 1, 2});
        int[] result3 = solution(new int[] {1, 0, 1, 1, 1, 3, 5});

        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : result3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}