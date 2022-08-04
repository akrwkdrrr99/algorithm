package search.depthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// #2644 graph 촌수계산 (dfs)
public class B_2644 {
    static List<Integer>[] Map;
    static boolean[] checked;
    static int res = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map = new ArrayList[n+1];
        checked = new boolean[n+1];
        for(int i=1; i<n+1; i++) {
            Map[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int l = Integer.parseInt(br.readLine());

        for(int i=0; i<l; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            Map[p].add(c);
            Map[c].add(p);
        }

        dfs(x,y, 0);
        System.out.println(res);
    }

    static void dfs(int start, int end, int cnt) {
        if(start == end) {
            res = cnt;
            return;
        }

        checked[start] = true;
        for(int i=0; i<Map[start].size(); i++) {
            int next = Map[start].get(i);
            if(!checked[next]) {
                dfs(next, end, cnt+1);
            }
        }
    }
}
