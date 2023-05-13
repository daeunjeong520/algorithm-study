package programmers.level1;

/**
 * 시저 암호
 */
public class CaesarCipher {

    public static String solution(String s, int n) {

        char[] charArr = s.toCharArray();
        StringBuffer sb = new StringBuffer();

        for(char ch: charArr) {
            if(ch == ' ') {
                ch = ' ';
            }else {
                if(Character.isLowerCase(ch)) {
                    ch = (char) ((ch - 'a' + n) % 26 + 'a');
                }else {
                    ch = (char)((ch - 'A' + n) % 26 + 'A');
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result1 = solution("AB", 1);
        System.out.println(result1);

        String result2 = solution("z", 1);
        System.out.println(result2);

        String result3 = solution("a B z", 4);
        System.out.println(result3);
    }
}
