package programmers.level1;

public class HasardNum {

    public static boolean solution(int x) {
        String[] split = String.valueOf(x).split("");
        int sum = 0;

        for(int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }

        if(x % sum == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result1 = solution(10);
        System.out.println(result1);
    }
}
