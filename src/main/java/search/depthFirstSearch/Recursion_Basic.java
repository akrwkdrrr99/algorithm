package search.depthFirstSearch;
import java.util.Scanner;

//todo: factorial
public class Recursion_Basic {
    static int factorial(int N) {
        if(N<=1) return 1;
        else return N * factorial(N -1);
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        System.out.println(factorial(N));

        sc.close();
    }
}
