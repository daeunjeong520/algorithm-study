package programmers.introduction;

/**
 * 7의 개수
 */
public class SevenNumberTest {

    public static int solution(int[] array) {
        int answer = 0;
        String seven = "7";

        for(int i = 0; i< array.length; i++) {
            String str = String.valueOf(array[i]);
            String[] split = str.split("");

            for(int j = 0; j < split.length; j++) {
                if(split[j].equals(seven)) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{7, 77, 17});
        int result2 = solution(new int[]{10, 29});

        System.out.println(result1);
        System.out.println(result2);
    }
}
