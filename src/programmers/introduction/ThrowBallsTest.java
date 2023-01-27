package programmers.introduction;

/**
 * 공 던지기
 */
public class ThrowBallsTest {

    public static int solution(int[] numbers, int k) {
        int idx = 0;
        for(int i = 0; i < k; i++) {
            if(idx > numbers.length) {
                idx -= numbers.length;
            }
            idx += 2;
        }
        return numbers[idx-2];
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{1, 2, 3, 4}, 2);
        int result2 = solution(new int[]{1, 2, 3, 4, 5, 6}, 5);
        int result3 = solution(new int[]{1, 2, 3}, 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
