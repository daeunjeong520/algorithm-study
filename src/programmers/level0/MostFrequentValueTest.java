package programmers.level0;

/**
 * 최빈값 구하기
 */
public class MostFrequentValueTest {

    public static int solution(int[] array) {

        int[] countIdx = new int[1000]; // 0 ~ 999
        for(int i = 0; i < array.length; i++) {
            countIdx[array[i]]++;
        }
        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < 1000; i++) {
            if(max < countIdx[i]) {
                max = countIdx[i];
                maxIdx = i;
            }
        }
        int count = 0;
        for(int i = 0; i < 1000; i++) {
            if(max == countIdx[i]) {
                count++;
            }
        }
        if(count > 1) {
            return -1;
        }
        return maxIdx;
    }

    public static void main(String[] args) {

        int result1 = solution(new int[]{1, 2, 3, 3, 3, 4});
        int result2 = solution(new int[]{1, 1, 2, 2});
        int result3 = solution(new int[]{1});
        int result4 = solution(new int[]{1, 1, 2, 2, 3, 3});
        int result5 = solution(new int[]{998, 998, 998, 1, 1, 2});

        System.out.println(result1 + " " + result2 + " " + result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
