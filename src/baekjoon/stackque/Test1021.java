package baekjoon.stackque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * 회전하는 큐
 */
public class Test1021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        String[] choiceArr = br.readLine().split(" ");
        int[] choice = new int[m];

        for(int i = 0; i < m; i++) {
            choice[i] = Integer.parseInt(choiceArr[i]);
        }

        LinkedList<Integer> que = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            que.add(i); // que 초기화
        }

        int count = 0;

        for(int i = 0; i < m; i++) {

            int num = choice[i];
            int queIndex = que.indexOf(num);

            int midIndex = que.size() / 2;

            // 3번 연산
            if(queIndex > midIndex) {
                while(num != que.getFirst()) {
                    int last = que.removeLast();
                    que.addFirst(last);
                    count++;
                }

            }else {
                while(num != que.getFirst()) {
                    int first = que.removeFirst();
                    que.addLast(first);
                    count++;
                }
            }
            que.removeFirst();
        }
        System.out.println(count);
    }
}
