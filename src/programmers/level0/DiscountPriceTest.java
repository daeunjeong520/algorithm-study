package programmers.level0;

/**
 * 옷 가게 할인 받기
 */
public class DiscountPriceTest {

    public static int solution(int price) {
        int discountPer = 0;

        if(price >= 100000 && price < 300000) discountPer = 5;
        else if(price >= 300000 && price < 500000) discountPer = 10;
        else if(price >= 500000) discountPer = 20;

        return (int)(price - (price * discountPer / 100.0));
    }

    public static void main(String[] args) {
        int result1 = solution(150000);
        int result2 = solution(580000);

        System.out.println(result1);
        System.out.println(result2);
    }
}
