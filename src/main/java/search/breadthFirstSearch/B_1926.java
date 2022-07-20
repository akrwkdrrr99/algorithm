package search.breadthFirstSearch;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_1926 {
    static int N, M;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx;
    static int[] dy;
    static Queue<Areas> ar;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 설정값 잡기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map =new int[N][M];
        visit = new boolean[N][M];
        ar = new LinkedList<>();
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] ==0 || visit[i][j]) continue;
                count++;
                ar.offer(new Areas(i,j));
                visit[i][j] = true;
                area = 0;
                while(!ar.isEmpty()) {
                    Areas areas = ar.poll();
                    area++;
                    for(int k =0; k<4; k++) {
                        int cur_x = areas.x + dx[k];
                        int cur_y = areas.y + dy[k];
                        if (cur_x < 0 || cur_x >= N || cur_y < 0 || cur_y >= M) {
                            continue;
                        }
                        if (map[cur_x][cur_y] == 1 && !visit[cur_x][cur_y]) {
                            ar.offer(new Areas(cur_x, cur_y));
                            visit[cur_x][cur_y] = true;
                        }
                    }

                    if(area > max) {
                        max = area;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    public static class Areas {
        int x, y;

        public Areas(int x ,int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int setX(int x) {
            return x;
        }

        public int getY(int y) {
            return y;
        }
    }
}
