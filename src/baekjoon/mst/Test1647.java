package baekjoon.mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 도시 분할 계획
 */
public class Test1647 {

    static int[] parents;

    public static int kruskal(int v, int e, int[][] graph) {
        int result = 0;
        int bigCost = 0;

        Arrays.sort(graph, (x, y)-> x[2]-y[2]);

        for(int i = 1; i <= v; i++) {
            parents[i] = i;
        }

        for(int i = 0; i < e; i++) {
            if(find(graph[i][0]) != find(graph[i][1])) {
                union(graph[i][0], graph[i][1]);
                result += graph[i][2];

                bigCost = graph[i][2];
            }
        }
        return result - bigCost;
    }

    public static void union(int a, int b){
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
        int v, e;
        int[][] graph;

        String[] split = br.readLine().split(" ");
        v = Integer.parseInt(split[0]);
        e = Integer.parseInt(split[1]);
        graph = new int[e][3];

        for(int i = 0; i < e; i++) {
            String[] s = br.readLine().split(" ");
            graph[i][0] = Integer.parseInt(s[0]);
            graph[i][1] = Integer.parseInt(s[1]);
            graph[i][2] = Integer.parseInt(s[2]);
        }

        parents = new int[v+1];

        System.out.println(kruskal(v, e, graph));
    }
}
