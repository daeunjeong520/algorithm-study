package baekjoon.math;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 약수
 */
public class Test1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] numArr = new int[t];
        for(int i = 0; i < t; i++) {
            numArr[i] = sc.nextInt();
        }

        Arrays.sort(numArr);

        int result = 0;
        if(t % 2 == 1) {
            result = (int)Math.pow(numArr[numArr.length / 2], 2);
        }else {
            result = numArr[numArr.length / 2 - 1] * numArr[numArr.length / 2];
        }

        System.out.println(result);
    }
}
