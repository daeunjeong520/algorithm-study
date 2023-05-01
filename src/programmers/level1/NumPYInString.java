package programmers.level1;

/**
 * 문자열 내 p와 y의 개수
 */
public class NumPYInString {

    public static boolean solution(String s) {
        String[] split = s.split("");
        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i < split.length; i++) {
            if(split[i].equalsIgnoreCase("p")) {
                pCount++;
            }else if(split[i].equalsIgnoreCase("y")) {
                yCount++;
            }
        }
        if(pCount == yCount) {
            return true;
        }else if(pCount == 0 && yCount == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result1 = solution("pPoooyY");
        System.out.println(result1);

        boolean result2 = solution("Pyy");
        System.out.println(result2);
    }
}
