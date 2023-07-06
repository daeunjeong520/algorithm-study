package programmers.level0;

/**
 * 369 게임
 */
public class ThreeSixNineTest {

    public static int solution(int order) {
        String[] strArr = String.valueOf(order).split("");
        int count = 0;
        for(int i = 0; i<strArr.length; i++) {
            if((Integer.parseInt(strArr[i]) % 3 == 0 && Integer.parseInt(strArr[i]) != 0)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int result1 = solution(3);
        int result2 = solution(29423);

        System.out.println(result1);
        System.out.println(result2);
    }
}
