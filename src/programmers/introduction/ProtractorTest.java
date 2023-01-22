package programmers.introduction;

/**
 * 각도기 테스트 - 예각(1), 직각(2), 둔각(3), 평각(4)
 */
public class ProtractorTest {

    public static int solution(int angle) {
        if(angle > 0 && angle < 90) return 1;
        else if(angle == 90) return 2;
        else if(angle > 90 && angle < 180) return 3;
        else return 4;
    }

    public static void main(String[] args) {

        int result1 = solution(70);
        int result2 = solution(91);
        int result3 = solution(180);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
