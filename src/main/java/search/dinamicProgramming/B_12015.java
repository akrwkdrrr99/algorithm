package search.dinamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i= 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        int length = 1;
        for(int i = 1; i<N; i++) {
            int key = arr[i];

            if(dp[length - 1] < key) {
                length++;
                dp[length - 1] = key;
            } else {
                int lo = 0;
                int hi = length;
                while (lo < hi) {
                    int mid = (lo + hi) >>> 1;

                    if(dp[mid] < key) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                dp[lo] = key;
            }
        }

        System.out.println(length);
    }
}
