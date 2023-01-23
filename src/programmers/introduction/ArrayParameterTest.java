package programmers.introduction;

public class ArrayParameterTest {

    public static int getDoubleNum(int num) {
        num = num * 2;
        return num;
    }

    public static void main(String[] args) {
        int doubleNum = getDoubleNum(10);
        System.out.println(doubleNum);
    }
}
