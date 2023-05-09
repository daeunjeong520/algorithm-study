package baekjoon.string;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * 파일 정리
 */
public class Test20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < t; i++) {
            String[] s = br.readLine().split("\\.");
            String key = s[1];

            if(map.get(key) == null) {
                int count = 1;
                map.put(key, count);
            }else {
                int val = map.get(key);
                val += 1;
                map.put(key, val);
            }
        }

        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort(Comparator.naturalOrder());

        for(String key: keyList) {
            bw.write(key + " " + map.get(key) + "\n");
        }

        bw.close();
    }
}
