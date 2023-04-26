package baekjoon.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 계산기 프로그램
 */
public class Test5613 {

    public static int solution(ArrayList<String> numArr) {
        int answer = Integer.parseInt(numArr.get(0));

        for(int i = 1; i < numArr.size()-1; i++) {
            if(numArr.get(i).equals("+")) {
                answer += Integer.parseInt(numArr.get(i+1));

            }else if(numArr.get(i).equals("-")) {
                answer -= Integer.parseInt(numArr.get(i+1));

            }else if(numArr.get(i).equals("*")) {
                answer *= Integer.parseInt(numArr.get(i+1));

            }else if(numArr.get(i).equals("/")) {
                answer /= Integer.parseInt(numArr.get(i+1));
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String ch = sc.next();
            if(ch.equals("=")) {
                break;
            }
            list.add(ch);
        }
        int result = solution(list);
        System.out.println(result);
    }
}
