package baekjoon.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 패션왕 신해빈
 */
public class Test9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int t = Integer.parseInt(br.readLine());

            for(int j = 0; j < t; j++) {
                String[] str = br.readLine().split(" ");
                String kind = str[1];

                if(map.get(kind) == null) {
                    map.put(kind, 1);
                }else {
                    int count = map.get(kind);
                    map.put(kind, ++count);
                }
            }
            int answer = 1;
            for (Integer integer : map.values()) {
                answer *= integer + 1;
            }
            System.out.println(answer - 1);
        }
    }
}