package search.depthFirstSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Counting.sort 사용
public class B_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[8001];

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int median = 10000;
        int mode = 10000;

        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value;
            arr[value + 4000]++;

            if(max < value) {
                max = value;
            }
            if(min > value) {
                min = value;
            }
        }

        boolean check = false;
        int maxCount = 0;
        int count = 0;

        for(int i= min+ 4000; i<= max+4000; i++) {
            if(arr[i]>0) {
                if(count < (N+1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                if(maxCount < arr[i]) {
                    check = true;
                    maxCount = arr[i];
                    mode = i - 4000;
                } else if(maxCount == arr[i] && check == true) {
                    check = false;
                    mode = i - 4000;
                }

            }
        }


        StringBuilder sb = new StringBuilder();
        //산술평균
        sb.append((int) Math.round((double)sum / N)).append("\n");
        //중앙값
        sb.append(median).append("\n");
        //최빈값
        sb.append(mode).append("\n");
        //범위
        sb.append(max - min);

        System.out.println(sb);
    }
}
//// Arrays.sort 사용
//public class B_2108 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        double sum = 0;
//        int[] arr = new int[N];
//        for(int i= 0; i<N; i++) {
//            int num = Integer.parseInt(br.readLine());
//            arr[i] = num;
//            sum += num;
//        }
//        long total = Math.round(sum / N);
//        Arrays.sort(arr);
//
//        boolean check = false;
//        int maxCount = 0;
//        int mode = 0;
//        for(int i=0; i<N; i++) {
//            int jump = 0;
//            int count = 1;
//            int value = arr[i];
//
//            for(int j=i+1; j<N; j++) {
//                if(value != arr[j]) break;
//                count++;
//                jump++;
//            }
//
//            if(count > maxCount) {
//                check = true;
//                maxCount = count;
//                mode = value;
//            } else if(count == maxCount && check == true) {
//                check = false;
//                mode = value;
//            }
//            i += jump;
//        }
//
//
//        StringBuilder sb = new StringBuilder();
//        //산술평균
//        sb.append(total).append("\n");
//        //중앙값
//        sb.append(arr[N/2]).append("\n");
//        //최빈값
//        sb.append(mode).append("\n");
//        //범위
//        sb.append(arr[N-1] - arr[0]);
//
//        System.out.println(sb);
//    }
//}