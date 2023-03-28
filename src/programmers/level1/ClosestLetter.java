package programmers.level1;

import java.util.Arrays;

public class ClosestLetter {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] str = s.split("");
        String result = "";
        for(int i = 0; i< str.length; i++) {
            if(!result.contains(str[i])) {
                answer[i] = -1;
                result += str[i];
            }else {
                answer[i] = i - result.lastIndexOf(str[i]);
                result += str[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result1 = solution("banana");
        int[] result2 = solution("foobar");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
