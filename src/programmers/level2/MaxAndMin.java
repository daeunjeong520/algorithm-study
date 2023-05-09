package programmers.level2;

import java.util.Arrays;

/**
 * 최댓값과 최솟값
 */
public class MaxAndMin {

    public static String solution(String s) {
        String[] split = s.split(" ");
        int[] intArr = new int[split.length];

        for(int i = 0; i< intArr.length; i++) {
            intArr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(intArr);

        StringBuffer sb = new StringBuffer();
        sb.append(intArr[0]);
        sb.append(" ");
        sb.append(intArr[intArr.length-1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        String result1 = solution("1 2 3 4");
        System.out.println(result1);

        String result2 = solution("-1 -2 -3 -4");
        System.out.println(result2);

        String result3 = solution("-1 -1");
        System.out.println(result3);
    }
}
