package search.dinamicProgramming;

import java.util.Scanner;


public class B_11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Double count = Math.pow(2,N);


        sb.append(count.intValue() - 1).append("\n");

        Calc_11729(N,1,2,3);
        System.out.println(sb);
    }

    public static void Calc_11729(int N, int start, int mid, int to) {
        if(N ==1) {
            sb.append(start + " "+ to + "\n");
            return;
        }

        Calc_11729(N-1,start,to,mid);
        sb.append(start + " " + to + "\n");
        Calc_11729(N-1,mid,start,to);
    }
}
