package baekjoon.stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 단어 뒤집기 2
 */
public class Test17413 {
    public static String solution(String s) {

        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();

        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == '<') {
                if(!stack.isEmpty()) {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }

                sb.append("<");
                int index = i+1;

                while(charArr[index] != '>') {
                    sb.append(charArr[index]);
                    index++;
                }
                sb.append(">");
                i = index;

            }else if(charArr[i] == ' '){
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }else {
                stack.push(charArr[i]);
            }
        }

        if(!stack.isEmpty()) {
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = solution(s);
        System.out.println(result);

    }
}
