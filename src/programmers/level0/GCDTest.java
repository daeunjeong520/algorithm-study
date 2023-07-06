package programmers.level0;

/**
 * 최대공약수(GCD) 구하기
 */
public class GCDTest {

    public static int GCD(int num1, int num2) {

        int gcd = 1;
        for(int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int gcd = GCD(10, 15);
        int gcd2 = GCD(20, 40);

        System.out.println(gcd);
        System.out.println(gcd2);
    }
}