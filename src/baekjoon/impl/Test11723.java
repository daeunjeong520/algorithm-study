package baekjoon.impl;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * 집합
 */
public class Test11723 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int m = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "add":
                    set.add(st.nextToken());
                    break;
                case "remove":
                    set.remove(st.nextToken());
                    break;
                case "toggle":
                    String num = st.nextToken();
                    if(!set.contains(num)) {
                        set.add(num);
                    }else {
                        set.remove(num);
                    }
                    break;
                case "all":
                    set.clear();
                    for(int j = 1; j <= 20; j++) {
                        set.add(String.valueOf(j));
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
                case "check":
                    if(set.contains(st.nextToken())) {
                        bw.write(1 + "\n");
                    }else {
                        bw.write(0 + "\n");
                    }
                    break;
            }
        }
        bw.close();
    }
}
