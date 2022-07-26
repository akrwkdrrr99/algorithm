package search.depthFirstSearch;
import java.util.*;
import java.io.*;

//Todo: dfs 실패
public class B_2663_a {
    static int[][] map; //지도
    static boolean[][] visited; //방문여부
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};
    static int[] aparts;
    static int N;
    static int apartNum = 0; //아파트 단지 번호의 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        //전체 사각형 입력 받기
        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = input.charAt(j)-'0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    apartNum++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for(int i=0; i<aparts.length; i++){
            if(aparts[i] == 0){
            }else{
                System.out.println(aparts[i]);
            }
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[apartNum]++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < N && ny < N){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}
