package search.binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//Todo: 나무자르기 - binarySearch
public class B_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] treeH = new int[N];
        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i < N; i++) {
            treeH[i] = Integer.parseInt(st.nextToken());

            if(max < treeH[i])
                max = treeH[i];
        }

        while(min < max) {
            int mid = (min + max) / 2;
            long sum = 0; // 잘린 나무의 합은 int범위 초가 가능성.

            for(int height : treeH) {
                if(height - mid > 0)
                    sum += (height - mid);
            }

            if(sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
