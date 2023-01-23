package programmers.introduction;

/**
 * 짝수 홀수 개수([짝수개수, 홀수개수])
 */
public class EvenOddNumCountTest {

    public static int[] solution(int[] num_list) {
        int countEven = 0, countOdd = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                countEven++;
            }else {
                countOdd++;
            }
        }
        return new int[]{countEven, countOdd};
    }

    public static void main(String[] args) {

        int[] result1 = solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = solution(new int[]{1, 3, 5, 7});

        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
