//package showMeTheDungeon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//
//public class one_3 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        StringTokenizer st = new StringTokenizer(s, " ");
//
//        long result = 0;
//        int N = Integer.parseInt(st.nextToken());
//        long[] group1 = new long[N+1];
//        long[] group2 = new long[N+1];
//        group1[0] = 0L;
//        group2[0] = 0L;
//        long sum = 0;
//
//        s = br.readLine();
//        for(int i=1; i<N; i++) {
//            st = new StringTokenizer(s, " ");
//            sum += Long.parseLong(st.nextToken());
//            group1[i] = sum;
//        }
//
//        s = br.readLine();
//        sum = 0L;
//        for(int i=1; i<N; i++) {
//            st = new StringTokenizer(s, " ");
//            sum += Long.parseLong(st.nextToken());
//            group2[i] = sum;
//        }
//
//        for(int i=0; i<N+1; i++) {
//            calc();
//        }
//        System.out.println(result);
//    }
//
//    // 투포인터 알고리즘이 편해보임
//    public static long calc(int A, int B, long[] arr) {
//        long summary = arr[B] - arr[A];
//        return summary;
//    }
//
//    public static boolean isPair(long[] arr1, long[] arr2, int x) {
//        int left = 0;
//        int right = n
//    }
//
//}
