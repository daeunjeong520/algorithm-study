package programmers.level0;

/**
 * 인덱스 바꾸기
 */
public class ChangeIndexTest {

    public static String solution(String my_string, int num1, int num2) {

        String[] strArr = my_string.split("");
        String strNum1 = strArr[num1];
        String strNum2 = strArr[num2];

        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i] == strNum1) strArr[i] = strNum2;
            else if(strArr[i] == strNum2) strArr[i] = strNum1;
        }
        return String.join("", strArr);

        /*
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
         */
    }

    public static void main(String[] args) {
        String result1 = solution("hello", 1, 2);
        String result2 = solution("I love you", 3, 6);

        System.out.println(result1);
        System.out.println(result2);
    }
}
