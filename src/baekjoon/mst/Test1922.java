package baekjoon.mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 네트워크 연결
 */
public class Test1922 {
    static int[] parents;

    public static int kruskal(int v, int e, int[][] graph) {
        int wSum = 0;
        Arrays.sort(graph, (x, y)-> x[2]-y[2]);

        for(int i = 1; i < v+1; i++) {
            parents[i] = i;
        }

        for(int i = 0; i < e; i++) {
            if(find(graph[i][0]) != find(graph[i][1])) {
                union(graph[i][0], graph[i][1]);
                wSum += graph[i][2];
            }
        }
        return wSum;
    }

    public static void union(int a, int b) {
        int aP = find(a);
        int bP = find(b);

        if(aP != bP) {
            parents[aP] = bP;
        }
    }

    public static int find(int a) {
        if(a == parents[a]) {
            return a;
        }
        return parents[a] = find(parents[a]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int[][] graph = new int[e][3];

        for(int i = 0; i < e; i++) {
            String[] split = br.readLine().split(" ");
            graph[i][0] = Integer.parseInt(split[0]);
            graph[i][1] = Integer.parseInt(split[1]);
            graph[i][2] = Integer.parseInt(split[2]);
        }

        parents = new int[v+1];
        System.out.println(kruskal(v, e, graph));
    }
}
