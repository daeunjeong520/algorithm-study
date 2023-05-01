package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2차원 배열의 합
 */
public class Test2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);

        int[][] array = new int[n][m];

        for(int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            for(int j = 0; j < row.length; j++) {
                array[i][j] = Integer.parseInt(row[j]);
            }
        }
        int k = Integer.parseInt(br.readLine());

        for(int a = 0; a < k; a++) {
            int sum = 0;
            String[] index = br.readLine().split(" ");

            int i = Integer.parseInt(index[0]) - 1; // 0
            int j = Integer.parseInt(index[1]) - 1; // 0
            int x = Integer.parseInt(index[2]) - 1 ; // 1
            int y = Integer.parseInt(index[3]) - 1; // 2

            for(int b = i; b < x+1; b++) {
                for(int c = j; c < y+1; c++) {
                    sum += array[b][c];
                }
            }
            System.out.println(sum);
        }
    }
}
