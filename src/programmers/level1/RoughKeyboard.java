package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 대충 만든 자판
 */
public class RoughKeyboard {

    public static int[] solution(String[] keymap, String[] targets) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < keymap.length; i++) {
            String[] split = keymap[i].split("");

            int init = 1;
            for(int j = 0; j < split.length; j++) {
                if(map.get(split[j]) == null) {
                    map.put(split[j], init);
                }else {
                    int count = map.get(split[j]);
                    map.put(split[j], Math.min(count, init));
                }
                init++;
            }
        }

        int[] ret = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
            String[] target = targets[i].split("");
            int sum = 0;

            for(String key: target) {
                if(map.containsKey(key)) {
                    sum += map.get(key);
                }else {
                    sum = 0;
                    break;
                }
            }
            ret[i] = sum == 0 ? -1 : sum;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] result1 = solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});
        System.out.println(Arrays.toString(result1));

        int[] result2 = solution(new String[]{"AA"}, new String[]{"B"});
        System.out.println(Arrays.toString(result2));

        int[] result3 = solution(new String[]{"BC"}, new String[]{"AC", "BC"});
        System.out.println(Arrays.toString(result3));

        int[] result4 = solution(new String[]{"ABCDE"}, new String[]{"FGHIJ"});
        System.out.println(Arrays.toString(result4));
    }
}
