package programmers.level1;

/**
 * 콜라츠 추측
 */
public class CollatzNum {

    public static int solution(int num) {
        int count = 0;
        while(num > 1) {
            if(num % 2 == 0) {
                num /= 2;
                count++;
            }else {
                num = num * 3 + 1;
                count++;
            }
        }
        if(num != 1) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(6);
        System.out.println(result1);

        int result2 = solution(16);
        System.out.println(result2);

        int result3 = solution(626331);
        System.out.println(result3);

    }
}
