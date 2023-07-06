package programmers.level0;

/**
 * 로그인 성공? (구현중)
 */
public class SuccessLoginTest {

    public static String solution(String[] id_pw, String[][] db) {

        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];

        for(int i = 0; i < db.length; i++) {
            String db_id = db[i][0];
            String db_pw = db[i][1];

            if(id.equals(db_id)) { // id 일치
                if(pw.equals(db_pw)) { // pw 일치
                    answer = "login";
                }else {
                    answer = "wrong pw";
                }
            }else {
                answer = "fail";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String result1 = solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}});
        String result2 = solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}});
        String result3 = solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}});

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
