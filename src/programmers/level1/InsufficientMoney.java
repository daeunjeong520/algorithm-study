package programmers.level1;

/**
 * 부족한 금액 계산하기
 */
public class InsufficientMoney {

    public static long solution(int price, int money, int count) {
        long totalPrice = 0;

        for(int i = 1; i <= count; i++) {
            totalPrice += (long)price * i;
        }

        if(totalPrice < money) {
            return 0;
        }
        return totalPrice - money;
    }

    public static void main(String[] args) {
        long result1 = solution(3, 20, 4);
        System.out.println(result1);

        long result2 = solution(2500, 1000000000, 2500);
        System.out.println(result2);
    }
}
