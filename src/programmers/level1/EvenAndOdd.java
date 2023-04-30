package programmers.level1;

/**
 * 짝수와 홀수
 */
public class EvenAndOdd {

    public static String solution(int num) {
        if(num % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String result1 = solution(3);
        System.out.println(result1);

        String result2 = solution(4);
        System.out.println(result2);
    }
}
