package search.breadthFirstSearch;

import java.util.*;
import java.io.*;

//Todo: bfs 아파트 단지 성공
public class B_2663_b {
    static int[][] map; //지도
    static boolean[][] visited; //방문여부
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};
    static int count;
    static int N;
    static ArrayList<Integer> houses;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        //전체 사각형 입력 받기
        for(int i=0; i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        count = 0;
        houses = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    count = 1;
                    bfs(i,j);
                    houses.add(count);
                }
            }
        }

        Collections.sort(houses);
        System.out.println(houses.size());
        for(int h : houses) System.out.println(h);
    }

    static int bfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    bfs(nx,ny);
                    count++;
                }
            }
        }
        return count;
    }
}

