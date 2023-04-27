package baekjoon.impl;

import java.io.*;
import java.util.HashMap;

/**
 * 비밀번호 찾기
 */
public class Test17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            map.put(s[0], s[1]);
        }

        for(int i = 0; i < m; i++) {
            String site = br.readLine();
            String pwd = map.get(site);
            bw.write(pwd + "\n");
        }
        bw.close();
    }
}
