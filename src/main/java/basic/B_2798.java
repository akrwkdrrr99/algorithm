//package basic;
//
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class B_2798 {
//    public static void main(String[] args)  {
//        Scanner in = new Scanner(System.in);
//
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        int[] arr = new int[A];
//        Arrays.sort(arr, Collections.reverseOrder());
//        for(int i=0; i< A; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        int result = search(arr, A, B);
//        System.out.println(result);
//    }
//
//    public static int search(int[] arr, int A, int B){
//        int result = 0;
//        for (int i=0; i< A-2; i++) {
//            for (int j=i+1; j< A-1; j++) {
//                for (int k=j+1; k < A; k++) {
//                    int temp = arr[i] + arr[j] + arr[k];
//
//                    if(B == temp) {
//                        return temp;
//                    }
//
//                    if(result < temp && temp < B) {
//                        result = temp;
//                    }
//                }
//            }
//        }
//        return result;
//    }
//}
