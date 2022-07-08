package search.dinamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단오르기 - Bottom-UP
public class B_2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int[] arr = new int[N + 1];

        for(int i=1; i<= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];

        if(N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for(int i = 3; i<=N; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i - 1]) + arr[i];
        }

        System.out.println(dp[N]);
    }
}

//// 계단오르기 - Top-Down
//public class B_2579 {
//
//    static Integer dp[];
//    static int arr[];
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        dp = new Integer[N + 1];
//        arr = new int[N + 1];
//
//        for(int i=1; i<= N; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        dp[0] = arr[0];
//        dp[1] = arr[1];
//
//        if(N >= 2) {
//            dp[2] = arr[1] + arr[2];
//        }
//
//        System.out.println(Calc(N));
//    }
//
//    static int Calc(int N) {
//        if(dp[N] == null) {
//            dp[N] = Math.max(Calc(N-2), Calc(N-3) + arr[N - 1]);
//        }
//
//        return dp[N];
//    }
//
//}
