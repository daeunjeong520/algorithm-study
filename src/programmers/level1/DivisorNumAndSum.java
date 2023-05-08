package programmers.level1;

/**
 * 약수의 개수와 덧셈
 */
public class DivisorNumAndSum {

    public static int solution(int left, int right){

        int answer = 0;

        for(int i = left; i <= right; i++) {
            int divisor = divisor(i);

            if(divisor % 2 == 0) {
                answer += i;
            }else {
                answer -= i;
            }
        }
        return answer;
    }

    public static int divisor(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(13, 17);
        System.out.println(result1);
    }
}
