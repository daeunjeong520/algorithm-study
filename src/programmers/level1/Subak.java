package programmers.level1;

/**
 * 수박수박수박수..??
 */
public class Subak {

    public static String solution(int n) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sb.append("수");
            }else {
                sb.append("박");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result1 = solution(3);
        System.out.println(result1);

        String result2 = solution(4);
        System.out.println(result2);
    }
}
