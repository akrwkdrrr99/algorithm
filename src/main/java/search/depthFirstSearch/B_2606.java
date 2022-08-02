package search.depthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_2606 {
    static int count = 0; // 감염시킨 컴퓨터 수
    static int[][] map; // 그래프 배열
    static boolean[] check; // 방문 배열
    static int N, L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken()); // 정점의 수
        L = Integer.parseInt(st.nextToken()); // 간선의 수

        //todo: dfs
        map = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0;i<L;i++) { // 인접행렬을 통한 연결정보 저장
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        dfs(1);
        System.out.println(count-1); // 1번 컴퓨터는 제외해야 하므로 -1을 해준다.

        //todo: bfs
//        node=new int[n+1][n+1];
//        check = new int[n+1];
//
//        for(int i=0;i<m;i++) { // 그래프 구성
//            st = new StringTokenizer(br.readLine(), " ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            node[a][b]=1;
//            node[b][a]=1;
//
//        }
//
//        bfs(1);
    }
//    static void bfs(int start) { // BFS 메소드
//        Queue<Integer> queue = new LinkedList<>();
//
//        check[start] = 1;
//        queue.offer(start);
//        int cnt = 0; // 감염 된 컴퓨터의 수
//        while(!queue.isEmpty()) {
//            int x = queue.poll();
//
//            for(int i=1;i<node.length;i++) { // 차례대로 1번과 연결 된 컴퓨터들을 찾아 cnt변수 증가
//                if(node[x][i]==1 && check[i]!=1) {
//                    queue.offer(i);
//                    check[i] = 1;
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt); //모든 탐색을 마치고 cnt 출력
//    }

    // DFS 메소드
    static void dfs(int start) {
        check[start] = true; // 방문처리 후
        count++; // 감염된 컴퓨터 수 증가, 여기엔 최초 방문 1번 컴퓨터도 포함된다.

        for(int i=0;i<N;i++) { // 인접행렬을 탐색
            if(map[start][i]==1 && !check[i]) // 연결된 정점이면서 방문하지 않은 경우
                dfs(i);
        }
    }
}
