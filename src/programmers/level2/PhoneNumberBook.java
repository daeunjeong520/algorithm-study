package programmers.level2;

import java.util.HashSet;
import java.util.Set;

/**
 * 전화번호 목록
 */
public class PhoneNumberBook {

    public static boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for(String s: phone_book) {
            set.add(s);
        }

        for(String phone: phone_book) {
            for(int i = 0; i < phone.length(); i++) {
                String sub = phone.substring(0, i);
                if(set.contains(sub)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result1 = solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println(result1);

        boolean result2 = solution(new String[]{"123", "456", "789"});
        System.out.println(result2);
    }
}
