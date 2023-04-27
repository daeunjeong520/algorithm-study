package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 대칭 차집합
 */
public class Test1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        String[] aNum = br.readLine().split(" ");
        String[] bNum = br.readLine().split(" ");

        for(int i = 0; i < a; i++) {
            A.add(Integer.parseInt(aNum[i]));
        }
        for(int i = 0; i < b; i++) {
            B.add(Integer.parseInt(bNum[i]));
        }
        HashSet<Integer> aClone = new HashSet<>(A);
        A.removeAll(B);
        B.removeAll(aClone);

        System.out.println(A.size() + B.size());
    }
}
