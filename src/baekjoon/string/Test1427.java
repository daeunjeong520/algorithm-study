package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 소트인사이드
 */
public class Test1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split("");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n.length; i++) {
            list.add(Integer.parseInt(n[i]));
        }

        list.sort(Comparator.reverseOrder());
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
