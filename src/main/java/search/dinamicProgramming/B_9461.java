package search.dinamicProgramming;

import java.util.Scanner;

public class B_9461 {

    public static Long[] seq = new Long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(T>0) {
            int N= sc.nextInt();
            System.out.println(P(N));
            T--;
        }
        System.out.println(sb);
    }

    public static long P(int N) {
        if(seq[N] == null) {
            seq[N] = P(N-2)+P(N-3);
        }
        return seq[N];
    }
}
