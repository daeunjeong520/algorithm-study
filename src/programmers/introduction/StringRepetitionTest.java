package programmers.introduction;

/**
 * 문자 반복 출력하기 (hello, 3 -> hhheeellllllooo)
 */
public class StringRepetitionTest {

    public static String solution(String my_string, int n) {
        /*
        char[] charArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < charArr.length; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(charArr[i]);
            }
        }
        return sb.toString();

         */
        StringBuilder sb = new StringBuilder();
        for(char c: my_string.toCharArray()) {
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String result1 = solution("hello", 3);
        System.out.println(result1);
    }
}
