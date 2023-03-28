package programmers.level1;

public class SameSizeSubString {

    public static int solution(String t, String p) {
        int answer = 0;

        for(int i = 0; i < t.length()-p.length()+1; i++) {
            String str = t.substring(i, i + p.length());
            if(Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result1 = solution("3141592", "271");
        int result2 = solution("500220839878", "7");
        int result3 = solution("10203", "15");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
