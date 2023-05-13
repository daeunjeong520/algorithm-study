package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 바이러스
 */
public class Test2606 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        A = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i < N+1; i++) {
            A[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int u = Integer.parseInt(s[0]);
            int v = Integer.parseInt(s[1]);

            A[u].add(v);
            A[v].add(u);
        }

        DFS(1);

        int count = 0;
        for(int i = 1; i < N+1; i++) {
            if(visited[i]) {
                count++;
            }
        }
        System.out.println(count-1);
    }

    public static void DFS(int v) {
        if(visited[v]) {
            return;
        }
        visited[v] = true;

        for(int i : A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
