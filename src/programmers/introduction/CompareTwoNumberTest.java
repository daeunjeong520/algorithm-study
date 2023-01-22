package programmers.introduction;

/**
 * 숫자 비교하기
 */
public class CompareTwoNumberTest {

    public static int solution(int num1, int num2) {
        if(num1 == num2) return 1;
        else return -1;
    }

    public static void main(String[] args) {

        int result1 = solution(2, 3);
        int result2 = solution(11, 11);
        int result3 = solution(7, 99);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
