package programmers.level0;

/**
 * 배열 원소 길이
 */
public class StringArrLengthTest {

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] result1 = solution(new String[]{"We", "are", "the", "world!"});
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
