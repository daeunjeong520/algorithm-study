package programmers.introduction;

/**
 * 숫자 찾기
 */
public class FindNumberTest {

    public static int solution(int num, int k) {
        String[] numStr = String.valueOf(num).split("");
        int index = 0;

        for(int i = 0; i< numStr.length; i++) {
            if(String.valueOf(k).equals(numStr[i])) {
                index = i + 1;
                break;
            }
        }

        if(index == 0) return -1;
        else return index;
    }

    public static void main(String[] args) {

        int result1 = solution(29183, 1);
        int result2 = solution(232443, 4);
        int result3 = solution(123456, 7);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
