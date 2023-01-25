package programmers.introduction;

/**
 * 편지
 */
public class LetterTest {

    public static int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        int result1 = solution("happy birthday!");
        int result2 = solution("I love you~");

        System.out.println(result1);
        System.out.println(result2);
    }
}
