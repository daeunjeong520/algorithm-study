package programmers.introduction;

/**
 * 외계 행성의 나이 (a: 0 ~ j: 9)
 */
public class PlanetAgeTest {

    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String[] split = String.valueOf(age).split("");

        for(int i = 0; i < split.length; i++) {
            sb.append((char)(Integer.parseInt(split[i]) + 97));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String result1 = solution(23);
        String result2 = solution(51);
        String result3 = solution(100);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
