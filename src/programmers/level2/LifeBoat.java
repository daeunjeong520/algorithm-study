package programmers.level2;

import java.util.Arrays;

/**
 * 구명보트
 */
public class LifeBoat {

    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;

        int left = 0;
        int right = people.length-1;

        while(left <= right) {
            if(people[left] + people[right] > limit) {
                right--;
            }else if(people[left] + people[right] <= limit) {
                left++;
                right--;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println(result1);

        int result2 = solution(new int[]{70, 80, 50}, 100);
        System.out.println(result2);
    }
}
