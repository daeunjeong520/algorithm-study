package programmers.level0;

/**
 * 진료 순서 정하기
 */
public class ClinicOrderTest {

    public static int[] solution(int[] emergency) {
        int[] orderArr = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] > emergency[j]) {
                    orderArr[j]++;
                }
            }
        }
        for(int i = 0; i < emergency.length; i++) {
            orderArr[i]++;
        }

        return orderArr;
    }

    public static void main(String[] args) {

        int[] result1 = solution(new int[]{3, 76, 24});
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
