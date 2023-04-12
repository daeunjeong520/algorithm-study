package baekjoon.stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 포스택
 */
public class Test25556 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] nums = br.readLine().split(" ");
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(nums[i]);
        }

        Stack<Integer>[] stack = new Stack[4];
        for(int i = 0; i < stack.length; i++) {
            stack[i] = new Stack<Integer>();
            stack[i].push(0);
        }

        boolean isClean = true;

        for(int i = 0; i < n; i++) {

            boolean isSort = false;

            for(int j = 0; j < 4; j++) {

                if(numArr[i] > stack[j].peek()) {
                    stack[j].push(numArr[i]);
                    isSort = true;
                    break;
                }
            }

            if(!isSort) {
                isClean = false;
                break;
            }
        }
        System.out.println(isClean ? "YES" : "NO");
    }
}
