package programmers.level0;

/**
 * 특정 문자 제거하기(str.replace())
 */
public class RemoveCharTest {

    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {

        String result1 = solution("abcdef", "f");
        String result2 = solution("BCBdbe", "B");

        System.out.println(result1);
        System.out.println(result2);
    }
}