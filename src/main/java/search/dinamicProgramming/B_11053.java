package search.dinamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//todo: 최장 증가 부분 수열(LIS) 활용시 O(N logN)의 시간 복잡도. But O(N^2)의 알고리즘 풀이진행.
// dp활용 N^2를 이용하여 풀이 및 이분탐색법 까지 확인한다.
// 1. Top-Down(재귀)
public class B_11053 {
    static int[] seq;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        seq = new int[N];
        dp = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
            LTS(i);
        }

        int max = dp[0];
        for(int i=1; i<N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    static int LTS(int N) {
        if(dp[N] == null) {
            dp[N] = 1;

            for(int i = N - 1; i>=0; i--) {
                if(seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], LTS(i) + 1);
                }
            }
        }
        return dp[N];
    }
}