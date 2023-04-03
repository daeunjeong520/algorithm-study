package baekjoon.string;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 듣보잡(ArrayList - 시간초과)
 */
public class Test1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            if(set.contains(str)) {
                result.add(str);
            }
        }
        Collections.sort(result);

        bw.write(result.size() + "\n");
        for(int i = 0; i < result.size(); i++) {
            bw.write(result.get(i) + "\n");
        }
        bw.close();
    }
}
