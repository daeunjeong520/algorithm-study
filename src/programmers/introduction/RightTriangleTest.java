package programmers.introduction;

import java.util.Scanner;

/**
 * 직각 삼각형 출력
 */
public class RightTriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}