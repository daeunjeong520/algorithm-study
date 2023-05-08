package baekjoon.greedy;

import java.util.Scanner;

/**
 * 폴리오미노
 */
public class Test1343 {

    public static String solution(String s) {
        String answer = "";
        String A = "AAAA";
        String B = "BB";

        s = s.replaceAll("XXXX", A);
        answer = s.replaceAll("XX", B);

        if(answer.contains("X")) {
            return "-1";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = solution(s);
        System.out.println(result);
    }
}