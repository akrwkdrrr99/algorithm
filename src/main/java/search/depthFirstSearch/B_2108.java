package search.depthFirstSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class B_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        int min = 0;
        long sum = 0;
        int[] arr = new int[N];
        for(int i= 0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
            if(max < num)
                max = num;
            if(min > num)
                min = num;
        }
        long total = sum / N;
        Arrays.sort(arr);


        StringBuilder sb = new StringBuilder();
        //산술평균
        sb.append((int) total).append("\n");
        //중앙값
        sb.append((N-1)/2).append("\n");
        //최빈값
        sb.append(1).append("\n");
        //범위
        sb.append(max - min);

        System.out.println(sb);
    }

    private static int Calc(int[] arr, int N) {
        int count = 0;
        return count;
    }
}
