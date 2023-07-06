package programmers.level0;

/**
 * 자릿수 더하기
 */
public class NumberDigitAddTest {

    /*
    public static int solution(int n) {
        char[] charArr = String.valueOf(n).toCharArray();
        int sum = 0;

        for(int i = 0; i< charArr.length; i++) {
            sum += Integer.parseInt(String.valueOf(charArr[i]));
        }
        return sum;
    }
     */

    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] strArr = str.split("");

        for(int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {

        int result1 = solution(1234);
        int result2 = solution(930211);

        System.out.println(result1);
        System.out.println(result2);
    }
}
