package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 한번만 등장한 문자
 */
public class OnceChar {

    public static String solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] split = s.split("");

        for(String str: split) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(String key: map.keySet()) {
            if(map.get(key) == 1) {
                sb.append(key);
            }
        }
        char[] charArray = sb.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String result1 = solution("abcabcadc");
        System.out.println(result1);

        String result2 = solution("abdc");
        System.out.println(result2);

        String result3 = solution("hello");
        System.out.println(result3);
    }
}
