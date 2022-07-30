package search.breadthFirstSearch;

import java.util.*;
import java.io.*;

public class B_11724 {
    static int N;
    static boolean[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map =  new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i< M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = true;
            map[b][a] = true;
        }

        int count = 0;
        for(int i=1; i<N+1; i++) {
            if(!visited[i]) {
                bfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void bfs (int n) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(n);
        visited[n] = true;

        while(!q.isEmpty()) {
            int now = q.poll();
            for(int i=1; i< N; i++) {
                if(!visited[now] && map[now][i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}

