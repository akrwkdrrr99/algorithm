package search.dinamicProgramming;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1149 {
    static int[][] Cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Cost = new int[N][3];
        dp = new int[N][3];

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            if(i==0) {
                dp[0][0] = Cost[0][0] = Integer.parseInt(st.nextToken());
                dp[0][1] = Cost[0][1] = Integer.parseInt(st.nextToken());
                dp[0][2] = Cost[0][2] = Integer.parseInt(st.nextToken());
            } else {
                Cost[i][0] = Integer.parseInt(st.nextToken());
                Cost[i][1] = Integer.parseInt(st.nextToken());
                Cost[i][2] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Math.min(Calc(N-1,0), Math.min(Calc(N-1,1), Calc(N-1,2))));
    }

    static int Calc(int N, int M) {
        if(dp[N][M] == 0) {
            if(M == 0) {
                dp[N][0] = Math.min(Calc(N-1, 1), Calc(N-1, 2)) + Cost[N][0];
            } else if(M == 1) {
                dp[N][1] = Math.min(Calc(N-1, 0), Calc(N-1, 2)) + Cost[N][1];
            } else {
                dp[N][2] = Math.min(Calc(N-1, 0), Calc(N-1, 1)) + Cost[N][2];
            }
        }
        return dp[N][M];
    }

}
