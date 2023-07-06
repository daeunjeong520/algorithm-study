package programmers.level0;

/**
 * 머쓱이보다 키 큰 사람
 */
public class TallerThanMusckTest {

    public static int solution(int[] array, int height) {
        int count = 0;
        for(int i: array) {
            if(i > height) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int result1 = solution(new int[]{149, 180, 192, 170}, 167);
        int result2 = solution(new int[]{180, 120, 140}, 190);

        System.out.println(result1);
        System.out.println(result2);
    }
}
