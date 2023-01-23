package programmers.introduction;

/**
 * 점의 위치 구하기(1, 2, 3, 4사분면)
 */
public class DotLocationTest {

    public static int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if(x > 0 && y > 0) return 1;
        else if(x < 0 && y > 0) return 2;
        else if(x < 0 && y < 0) return 3;
        else return 4;
    }

    public static void main(String[] args) {

        int result1 = solution(new int[]{2, 4});
        int result2 = solution(new int[]{-7, 9});

        System.out.println(result1);
        System.out.println(result2);
    }
}
