package programmers.level0;

/**
 * 가위 바위 보 (가위: 2, 바위: 0, 보: 5)
 * 2:0, 0:5, 5:2
 */
public class RspTest {

    public static String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        String[] rspSplit = rsp.split("");

        for(int i = 0; i < rspSplit.length; i++) {
            switch (rspSplit[i]) {
                case "2": sb.append("0"); break;
                case "0": sb.append("5"); break;
                case "5": sb.append("2"); break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String result1 = solution("2");
        String result2 = solution("205");

        System.out.println(result1);
        System.out.println(result2);
    }
}