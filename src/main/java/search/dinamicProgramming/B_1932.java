package search.dinamicProgramming;

import java.util.*;
import java.io.*;

// 정수형 삼각형
public class B_1932 {
    static Integer[][] dp;
    static int[][] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new Integer[N][N];
        StringTokenizer st;
        for(int i=0; i< N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<i+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i< N; i++) {
            dp[N-1][i] = arr[N-1][i];
        }

        System.out.println(Calc(0,0));
    }

    static int Calc(int dep, int idx) {
        if(dep == N - 1) return dp[dep][idx];

        if(dp[dep][idx] == null) {
            dp[dep][idx] = Math.max(Calc(dep+1, idx), Calc(dep+1, idx+1))+ arr[dep][idx];
        }

        return dp[dep][idx];
    }
}
