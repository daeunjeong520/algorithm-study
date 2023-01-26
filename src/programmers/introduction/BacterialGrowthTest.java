package programmers.introduction;

/**
 * 세균 증식 - n마리 t시간 후(1시간 두배 증식)
 */
public class BacterialGrowthTest {

    public static int solution(int n, int t) {
        return n * (int)Math.pow(2, t);
    }

    public static void main(String[] args) {
        int result1 = solution(2, 10);
        int result2 = solution(7, 15);

        System.out.println(result1);
        System.out.println(result2);
    }
}
