package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 소수 찾기
 */
public class Test1978 {

    public static ArrayList<Integer> getDivisor(int num) {
        ArrayList<Integer> list = new ArrayList();

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                list.add(i);
            }
        }
        list.add(num);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            list.add(sc.nextInt());
        }

        int count = 0;
        for(int num: list) {
            ArrayList<Integer> divisor = getDivisor(num);
            if(divisor.size() == 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
