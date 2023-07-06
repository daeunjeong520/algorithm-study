package programmers.level0;

/**
 * 아메리카노(5500)원 - 최대 잔수와 남은 돈
 */
public class IceAmericanoTest {

    public static int[] solution(int money) {
        return new int[]{ money / 5500, money % 5500};
    }

    public static void main(String[] args) {
        int[] result1 = solution(5500);
        int[] result2 = solution(15000);

        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}