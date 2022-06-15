package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1010 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dp = new int[30][30];

        for (int i=0; i< 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for(int i=2; i< 30; i++) {
            for(int j=1; j< 30; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(dp[M][N]).append('\n');
        }
        System.out.println(sb);
    }
}
//public class B_1010 {
//    public static void main(String[] args) throws IOException  {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int total = Integer.parseInt(st.nextToken());
//        while(total > 0) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(comb(b,a));
//            total--;
//        }
//    }
//
//
//    //재귀 사용
//    public static int comb(int n, int r) {
//        int result = 1;
//        for (int i =1; i<=r; i++) {
//            result = result * (n - i + 1) / i;
//        }
//        return result;
//    }
//}
