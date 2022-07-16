package search.dinamicProgramming;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B_9465 {
    public static int[][] arr;
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++) {
            int T = Integer.parseInt(br.readLine());
            arr = new int[2][T+1];
            dp = new int[2][T+1];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j<=T; j++) {
                arr[0][j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j<=T; j++) {
                arr[1][j] = Integer.parseInt(st.nextToken());
            }


            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];
            for(int j = 2; j<=T; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + arr[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + arr[1][j];
            }
            sb.append(Math.max(dp[0][T], dp[1][T])).append("\n");
        }
        System.out.println(sb);
    }
}
