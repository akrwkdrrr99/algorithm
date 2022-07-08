package search.dinamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_9184 {

    static int dp[][][] = new int[21][21][21];

    public static int w(int a, int b, int c){

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }

        if (a < b && b < c){
            if(dp[a][b][c] != 0) return dp[a][b][c];
            else return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }

        if(dp[a][b][c] != 0) return dp[a][b][c];
        else return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == -1 && b == -1 && c == -1) break;

            System.out.println("w("+a+", "+b+", "+c+") = "+w(a, b, c));
        }
    }
}

//// 재귀호출 + 메모지에이션으로 동적계획법 사용
//public class B_9184 {
//    static int[][][] dp = new int[21][21][21];
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        Scanner scanner = new Scanner(System.in);
//
//        int a = 0;
//        int b = 0;
//        int c = 0;
//
//        while(true) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//            int C = Integer.parseInt(st.nextToken());
//
//
//
//            if(a == -1 && b == -1 && c == -1) {
//                break;
//            }
//            if(A == -1 && B == -1 && C == -1) {
//                break;
//            }
//
//            sb.append("w(" + A+ ", "+ B +", "+ C+") = ").append(w(A,B,C)).append("\n");
//        }
//        System.out.println(sb);
//        scanner.close();
//    }
//
//    public static int w(int a, int b, int c) {
//        if(dp[a][b][c] != 0) {
//            return dp[a][b][c];
//        }
//
//        if(a <= 0 || b <= 0 || c <= 0) {
//            return 1;
//        }
//
//        if(a > 20 || b > 20 || c > 20) {
//            return dp[20][20][20] = w(20, 20, 20);
//        }
//
//        if(a < b && b < c) {
//            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
//        }
//
//        return w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
//    }
//
//}
