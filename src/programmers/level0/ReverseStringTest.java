package programmers.level0;

/**
 * 문자열 뒤집기
 */
public class ReverseStringTest {

    public static String solution(String my_string) {
        char[] strCharArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = strCharArr.length-1; i >= 0; i--) {
            sb.append(strCharArr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String result1 = solution("jaron");
        String result2 = solution("bread");

        System.out.println(result1);
        System.out.println(result2);
    }
}
