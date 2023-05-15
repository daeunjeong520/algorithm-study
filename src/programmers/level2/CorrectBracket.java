package programmers.level2;

import java.util.Stack;

/**
 * 올바른 괄호
 */
public class CorrectBracket {

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();

        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == '(') {
                stack.push(charArr[i]); // (
            }else { // )

                if(!stack.isEmpty()) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result1 = solution("()()");
        System.out.println(result1);

        boolean result2 = solution(")()(");
        System.out.println(result2);

        boolean result3 = solution("(())()");
        System.out.println(result3);

        boolean result4 = solution("(()(");
        System.out.println(result4);
    }
}
