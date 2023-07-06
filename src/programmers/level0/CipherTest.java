package programmers.level0;

/**
 * 암호 해독 - code 의 배수번째 글자만 암호
 */
public class CipherTest {

    /*
    public static String solution(String cipher, int code){
        String answer = "";
        for(int i = 1; i <= cipher.length() / code; i++) {
            answer += String.valueOf(cipher.charAt(code * i - 1));
        }
        return answer;
    }
     */
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i = code; i <= cipher.length(); i = i + code){
            answer += cipher.substring(i - 1, i);
        }
        return answer;
    }


    public static void main(String[] args) {
        String result1 = solution("dfjardstddetckdaccccdegk", 4);
        String result2 = solution("pfqallllabwaoclk", 2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
