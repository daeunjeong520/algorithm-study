package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 문자열 집합
 */
public class Test14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] nm = input.split(" ");

        int count = 0;
        Set<String> s = new HashSet<>();

        for(int i = 0; i < Integer.parseInt(nm[0]); i++) {
            s.add(br.readLine());
        }

        for(int i = 0; i < Integer.parseInt(nm[1]); i++) {
            String str = br.readLine();
            if(s.contains(str)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
