package programmers.level1;

/**
 * 문자열 다루기 기본
 */
public class StringTestBasic {

    public static boolean solution(String s) {

        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        char[] charArray = s.toCharArray();
        for(int ch: charArray) {
            if(!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result1 = solution("a234");
        System.out.println(result1);

        boolean result2 = solution("1234");
        System.out.println(result2);
    }
}