package programmers.level1;

/**
 * 서울에서 김서방 찾기
 */
public class FindKim {

    public static String solution(String[] seoul) {

        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].contains("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String result1 = solution(new String[]{"Jane", "Kim"});
        System.out.println(result1);


    }
}
