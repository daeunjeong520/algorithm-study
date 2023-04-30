package baekjoon.string;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 접미사 배열
 */
public class Test11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, s.length());
            list.add(sub);
        }
        list.sort(Comparator.naturalOrder());

        for(String ele: list) {
            bw.write(ele + "\n");
        }

        bw.close();
    }
}
