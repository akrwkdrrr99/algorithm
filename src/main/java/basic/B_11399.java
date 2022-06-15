package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

//public class B_11399 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int cnt = Integer.parseInt(st.nextToken());
//        int[] arr = new int[cnt];
//        st = new StringTokenizer(br.readLine());
//
//        for(int i=0; i< cnt; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//
//        int result = 0;
//        int sum = 0;
//        for(int time:arr) {
//            sum = sum + time;
//            result += sum;
//        }
//        System.out.println(result);
//    }
//}
