package programmers.level0;

import java.util.Arrays;

/**
 * OX 퀴즈
 */
public class OXQuiz {

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String str = quiz[i];
            String[] split = str.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[2]);

            if(split[1].equals("-")) {
                if(a - b == Integer.parseInt(split[4])) {
                    answer[i] = "O";
                }else {
                    answer[i] = "X";
                }
            }else {
                if(a + b == Integer.parseInt(split[4])) {
                    answer[i] = "O";
                }else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] result1 = solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        System.out.println(Arrays.toString(result1));

        String[] result2 = solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        System.out.println(Arrays.toString(result2));
    }
}
