package baekjoon.string;

import java.util.Scanner;

public class Test10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArr = s.toCharArray();
        int[] cntArr = new int[26];

        for(char ch: charArr) {
            int index = (int) ch - 'a';
            cntArr[index]++;
        }

        StringBuffer sb = new StringBuffer();
        for(int cnt: cntArr) {
            sb.append(cnt + " ");
        }
        System.out.println(sb);
    }
}
