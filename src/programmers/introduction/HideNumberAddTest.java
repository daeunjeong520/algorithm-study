package programmers.introduction;

/**
 * 숨어있는 숫자의 덧셈 (1)
 */
public class HideNumberAddTest {

    public static int solution(String my_string) {
        String[] split = my_string.split("");

        int sum = 0;
        for(int i = 0; i < split.length; i++) {
            try {
                int num = Integer.parseInt(split[i]);
                sum += num;
            }catch (NumberFormatException e) {
                continue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = solution("aAb1B2cC34oOp");
        int result2 = solution("1a2b3c4d123");

        System.out.println(result1);
        System.out.println(result2);
    }
}
