package programmers.level1;

/**
 * 삼총사
 */
public class Trio {

    public static int solution(int[] numbers){
        int count = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                for(int k = j+1; k < numbers.length; k++) {
                    if(numbers[i] + numbers[j] + numbers[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println(result1);

        int result2 = solution(new int[]{-3, -2, -1, 0, 1, 2, 3});
        System.out.println(result2);

        int result3 = solution(new int[]{-1, 1, -1, 1});
        System.out.println(result3);
    }
}
