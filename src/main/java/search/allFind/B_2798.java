package search.allFind;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i< N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Calc(arr, total));
    }

    public static int Calc(int[] arr, int total) {
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j< arr.length -1; j++) {
                for(int k=2; k<arr.length - 2; k++) {
                    int sum = 0;
                    if(k!=j && j!=i && k!= i) {
                        sum += arr[i] + arr[j] + arr[k];
                    }
                    if(result < sum && sum<= total) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
