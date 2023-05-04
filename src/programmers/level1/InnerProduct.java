package programmers.level1;

/**
 * 내적
 */
public class InnerProduct {

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        System.out.println(result1);

        int result2 = solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1});
        System.out.println(result2);
    }
}
