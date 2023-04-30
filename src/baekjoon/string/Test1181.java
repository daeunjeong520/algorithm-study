package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Test1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < t; i++) {
            String s = br.readLine();
            set.add(s);
        }

        ArrayList<String> list = new ArrayList<>(set);
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }else {
                    return s1.length() - s2.length();
                }
            }
        };
        list.sort(comparator);

        for(String s: list) {
            System.out.println(s);
        }
    }
}
