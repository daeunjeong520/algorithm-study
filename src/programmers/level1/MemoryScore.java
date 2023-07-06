package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 추억 점수
 */
public class MemoryScore {

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]); // 인물 이름, 그리움 점수
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < photo.length; i++) {
            String[] picture = photo[i];
            int sum = 0;

            for(int j = 0; j < picture.length; j++) {
                if(map.containsKey(picture[j])) {
                    int score = map.get(picture[j]);
                    sum += score;
                }
            }
            list.add(sum);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result1 = solution(new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}
                });
        System.out.println(Arrays.toString(result1));
    }
}
