package programmers.level1;

/**
 * 가운데 글자 가져오기
 */
public class GetMiddleWord {

    public static String solution(String s) {
        StringBuffer sb = new StringBuffer();
        String[] split = s.split("");

        if(split.length % 2 == 1) {
            sb.append(split[split.length/2]);
        }else {
            sb.append(split[split.length/2 -1]);
            sb.append(split[split.length/2]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String result1 = solution("abcde");
        System.out.println(result1);

        String result2 = solution("qwer");
        System.out.println(result2);
    }
}
