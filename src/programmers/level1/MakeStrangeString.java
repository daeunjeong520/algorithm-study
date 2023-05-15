package programmers.level1;

/**
 * 이상한 문자 만들기
 */
public class MakeStrangeString {

    public static String solution(String s) {
        StringBuffer sb = new StringBuffer();
        String[] split = s.split("");

        int idx = 0;
        for(int i = 0; i < split.length; i++) {
            if(split[i].equals(" ")) {
                sb.append(" ");
                idx = 0;
            }else if(idx % 2 == 0) {
                sb.append(split[i].toUpperCase());
                idx++;
            }else if(idx % 2 == 1) {
                sb.append(split[i].toLowerCase());
                idx++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result1 = solution("try hello world");
        System.out.println(result1);
    }
}
