package search.binarySearch;

import java.util.Scanner;

//todo: 이분탐색으로
public class B_1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long left = 0;
        long right = M;

        while(left < right) {
            long mid = (left + right) / 2;
            long count = 0;


            for(int i = 1; i<= N; i++) {
                count+= Math.min(mid / i, N);
            }

            // 카운트가 많다는 것은 임의의 값(mid)보다 B[M]의 수가 더많다는 것.
            if(M <= count) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}

//todo: 과한 메모리 사용...
//public class B_1300 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[][] arr1 = new int[N][N];
//        int[] arr2 = new int[N*N];
//        int count = 0;
//        for(int i = 0; i<N; i++) {
//            for(int j =0; j<N; j++) {
//                arr1[i][j] = (i+1)*(j+1);
//                arr2[count] = arr1[i][j];
//                count++;
//            }
//        }
//        Arrays.sort(arr2);
//        System.out.println(arr2[M]);
//    }
//}
