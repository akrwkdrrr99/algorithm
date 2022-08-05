package search.depthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

// 토마토
public class B_7569 {
    static int[][][] map;
    static boolean[][][] checked;
    int[] dx = {1, -1, 0, 0, 0, 0};
    int[] dy = {0, 0, 1, -1, 0, 0};
    int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        map = new int[M][N][H];
        checked = new boolean[M][N][H];
        for(int i=0; i<N; i++) {
            for(int j=0; j<H; j++) {
                st = new StringTokenizer(br.readLine());

            }
        }
    }
}
