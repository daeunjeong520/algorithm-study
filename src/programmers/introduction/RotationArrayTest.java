package programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 배열 회전시키기 (left, right)
 */
public class RotationArrayTest {

    public static int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(direction.equals("right")) {
            arrayList.add(numbers[numbers.length-1]); // 1
            for(int i = 0; i < numbers.length-1; i++) {
                arrayList.add(numbers[i]);
            }
        }else {
            for(int i = 1; i < numbers.length; i++) {
                arrayList.add(numbers[i]);
            }
            arrayList.add(numbers[0]);
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution(new int[]{1, 2, 3}, "right");
        int[] result2 = solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
