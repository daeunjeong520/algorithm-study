package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 연결 요소의 개수
 */
public class Test11724 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        A = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i < N+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int u = Integer.parseInt(s[0]);
            int v = Integer.parseInt(s[1]);

            A[u].add(v);
            A[v].add(u);
        }

        int count = 0;
        for(int i = 1; i < A.length; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    public static void DFS(int v) {
        if(visited[v]) {
            return;
        }
        visited[v] = true;

        for(int i: A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
