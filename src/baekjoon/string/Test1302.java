package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 베스트셀러
 */
public class Test1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < t; i++) {
            String book = br.readLine();

            if(map.get(book) == null) {
                map.put(book, 1);

            }else {
                Integer count = map.get(book);
                count++;
                map.put(book, count);
            }
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort(String::compareTo);

        int max = 0;
        String answer = "";

        for(String key: keyList) {
            if(max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
