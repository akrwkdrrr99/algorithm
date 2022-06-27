//package basic;
//
//import java.util.Scanner;
//
////재귀+ 점화식
//public class B_2579 {
//    static Integer dp[];
//    static int arr[];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        dp = new Integer[T+1];
//        arr = new int[T+1];
//
//        for(int i=1; i<=T; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // 0,1,2 는 초기화
//        dp[0] = arr[0];
//        dp[1] = arr[1];
//
//        if(T >= 2) {
//            dp[2] = arr[1] + arr[2];
//        }
//
//        System.out.println(find(T));
//    }
//
//    //재귀 + 점화식 도입.
//    static int find(int N) {
//        if(dp[N] == null) {
//            dp[N] = Math.max(find(N - 2), find(N - 3)+ arr[N -1]) + arr[N];
//        }
//
//        return dp[N];
//    }
//}
