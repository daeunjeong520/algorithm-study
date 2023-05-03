package programmers.level1;

/**
 * 핸드폰 번호 가리기
 */
public class HidePhoneNumber {

    public static String solution(String phone_number) {
        String[] split = phone_number.split("");

        for(int i = 0; i < split.length-4; i++) {
            split[i] = "*";
        }
        StringBuffer sb = new StringBuffer();
        for(String s: split) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result1 = solution("01033334444");
        System.out.println(result1);

        String result2 = solution("027778888");
        System.out.println(result2);
    }
}
