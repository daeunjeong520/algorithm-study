package programmers.introduction;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 배열의 유사도 - 같은 원소의 개수 return
 */
public class ArraySimilarityTest {

    public static int solution(String[] s1, String[] s2) {
        int count = 0;

        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
        int result2 = solution(new String[]{"n", "omg"}, new String[] {"m", "dot"});

        System.out.println(result1);
        System.out.println(result2);
    }
}
