package programmers.level0;

/**
 * 대문자와 소문자
 */
public class UpperLowerCaseTest {

    /*
    public static String solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] >= 65 && charArr[i] <= 90) {
                sb.append((char)(charArr[i] + 32));
            }else {
                sb.append((char)(charArr[i] - 32));
            }
        }
        return sb.toString();
    }
     */
    public static String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)) answer += String.valueOf(ch).toLowerCase();
            else answer += String.valueOf(ch).toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        String result1 = solution("cccCCC");
        String result2 = solution("abCdEfghIJ");

        System.out.println(result1);
        System.out.println(result2);
    }
}
