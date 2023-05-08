package programmers.level1;

/**
 * 3진법 뒤집기
 */
public class ReverseThreeBaseNum {

    public static int solution(int n) {
        StringBuffer sb = new StringBuffer();

        while(n >= 3) {
            int remain = n % 3;
            sb.append(remain);
            n /= 3;
        }
        sb.append(n);

        String[] s = sb.toString().split("");
        int answer = 0;
        int index = 0;

        for(int i = s.length-1; i >= 0; i--) {
            int num = Integer.parseInt(s[i]) * (int)Math.pow(3, index);
            index++;
            answer += num;
        }

        return answer;
    }

    public static void main(String[] args) {
        int result1 = solution(45);
        System.out.println(result1);

        int result2 = solution(125);
        System.out.println(result2);
    }
}
