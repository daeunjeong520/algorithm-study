package programmers.level0;

/**
 * 피자 나눠 먹기 (3)
 */
public class DivisionPizzaTest3 {

    public static int solution(int slice, int n) {
        if(n % slice == 0) return n / slice;
        else return n / slice + 1;
    }

    public static void main(String[] args) {

        int result1 = solution(7, 10);
        int result2 = solution(4, 12);

        System.out.println(result1);
        System.out.println(result2);
    }
}
