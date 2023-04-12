package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 최소, 최대
 */
public class Test10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        String[] strArr = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length-1]);
    }
}