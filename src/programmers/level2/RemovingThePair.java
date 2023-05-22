package programmers.level2;

import java.util.Stack;

/**
 * 짝지어 제거하기
 */
public class RemovingThePair {

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();

        stack.push(charArr[0]);

        for(int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty()) {
                char peek = stack.peek();

                if(peek == charArr[i]) {
                    stack.pop();
                }else {
                    stack.push(charArr[i]);
                }
            }else {
                stack.push(charArr[i]);
            }
        }

        if(stack.isEmpty()) {
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result1 = solution("baabaa");
        System.out.println(result1);

        int result2 = solution("cdcd");
        System.out.println(result2);
    }
}
