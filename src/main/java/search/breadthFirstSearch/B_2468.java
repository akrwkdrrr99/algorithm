package search.breadthFirstSearch;

import java.util.*;
import java.io.*;

public class B_2468 {
    static int[][] map; //지도
    static boolean[][] visited; //방문여부
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static int N, maxHeight;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        maxHeight = -1;
        //전체 사각형 입력 받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        int maxArea = 0;
        for (int i = 0; i < maxHeight + 1; i++) {
            int result = countArea(i);
            if (result > maxArea) {
                maxArea = result;
            }
        }

        System.out.println(maxArea);
    }
    static int countArea(int height) {
        visited = new boolean[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] > height) {
                    count++;
                    bfs(i, j, height);
                }
            }
        }
        return count;
    }

    static void bfs(int x, int y, int height) {
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                if(map[nx][ny] > height && !visited[nx][ny]){
                    bfs(nx,ny, height);
                }
            }
        }
    }
}
