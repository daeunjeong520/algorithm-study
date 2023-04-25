package baekjoon.stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 괄호
 */
public class Test9012 {

    public static String solution(String vps) {
        char[] charArr = vps.toCharArray();
        Stack<Character> stack = new Stack<>();
        String answer = "YES";

        boolean isVPS = false;
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ')') {
                isVPS = true;
            }
        }
        if(!isVPS) {
            return "NO";
        }

        for(int i = 0; i < charArr.length; i++) {

            if(charArr[i] == '(') {
                stack.push(charArr[i]);
            }else { // )

                if(!stack.isEmpty()) {
                    char peek = stack.peek(); // (
                    if(peek == '(') {
                        stack.pop();
                    }
                }else {
                    answer = "NO";
                }
            }
        }

        if(!stack.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String solution = solution(br.readLine());
            System.out.println(solution);
        }
    }
}
