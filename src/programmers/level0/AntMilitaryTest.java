package programmers.level0;

/**
 * 개미 군단
 */
public class AntMilitaryTest {

    public static int solution(int hp) {
        int[] armyAnt = {5, 3, 1};
        int count = 0;
        int remainHp = hp;

        for(int i = 0; i < 3; i++) {
            while(remainHp >= armyAnt[i]) {
                remainHp -= armyAnt[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = solution(23);
        int result2 = solution(24);
        int result3 = solution(999);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
