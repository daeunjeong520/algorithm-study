package programmers.introduction;

/**
 * 문자열 안에 문자열 (문자열 포함 여부 - str1.contains(str2))
 */
public class StringInStringTest {

    public static int solution(String str1, String str2) {
        if(str1.contains(str2)) return 1;
        else return 2;
    }

    public static void main(String[] args) {

        int result1 = solution("ab6CDE443fgh22iJKlmn1o", "6CD");
        int result2 = solution("ppprrrogrammers", "pppp");
        int result3 = solution("AbcAbcA", "AAA");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
