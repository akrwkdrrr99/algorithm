package basic;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class week1 {

////todo: 18258 베르트랑 공준
//
//public class Main{
//
//    public static boolean isPrime(int num){
//        if(num<2)
//        return false;
//
//        for(int i=2; i*i<=num; i++){  //
//            if(num% i == 0)
//            return false;
//            }
//            return true;
//
//    }
//
//    public static void main(String[]args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            int n = sc.nextInt();
//            int cnt = 0;
//            if(n!=0){
//                for(int i=n+1; i<=2*n; i++){
//                    if(isPrime(i) == true) cnt++;
//                }
//                System.out.println(cnt);
//            } else break;
//        }
//    }
//}


//class SolutionQ3 {
//    public int solution(int a, int b, int v) {
//        int day = (v - b) / (a - b);
//        if((v - b) % (a - b) != 0) {
//            day++;
//        }
//        return day;
//    }
//}
////TODO : 달팽이 올라가고싶다
//public class Main {
//    public static void main(String[] ars) throws Exception{
//        int a,b,v;
//        SolutionQ3 s = new SolutionQ3();
//        System.out.print("숫자열을 입력해주세요. :");
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        v = sc.nextInt();
//        System.out.println(s.solution(a,b,v));
//    }
//}


//public class Main {
//    public static void main(String[] ars) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int T = Integer.parseInt(st.nextToken());
//        for(int i=0; i< T; i++) {
//            st = new StringTokenizer(br.readLine());
//            int H = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
//            int Rn = 0;
//            if(N % H == 0) {
//                Rn = H * 100 + N / H;
//            } else {
//                Rn = 100 * (N % H) + N / H + 1;
//            }
//            System.out.println(Rn);
//        }
//    }
//}

//TODO: 소수구하기 에라토스테네스의 체
//public class Main {
//    public static boolean isPrime(int num){
//        if(num<2)
//            return false;
//
//        for(int i=2; i*i<=num; i++){  //
//            if(num% i == 0)
//                return false;
//        }
//        return true;
//
//    }
//
//    public static void main(String[] ars) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
//        int[] arr = new int[N];
//        int prime_cnt = 0;
//        for(int i=M; i<=N; i++) {
//            if(isPrime(i))
//                System.out.println(i);
//        }
//    }
//}


////todo: 더하기 사이클
//public class Main {
//    public static void main(String[] ars) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int cycle = 0;
//        if(a == 0) {
//            cycle = 1;
//        }
//        int start = a;
//        int result = 0;
//        boolean b = false;
//        while(result != a) {
//            if(start < 10) {
//                b = true;
//                start *= 10;
//            }
//            result = (start / 10) + (start % 10);
//            if(b) {
//                result = ((start/ 10) % 10) * 10 + (result % 10);
//            } else {
//                result = (start % 10) * 10 + (result % 10);
//            }
//            b = false;
//            cycle++;
//            start = result;
//        }
//        System.out.println(cycle);
//
//    }
//}

////todo: Fly me to the Alpha Centauri
//public class Main {
//    public static void main(String[] ars) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int T = Integer.parseInt(st.nextToken());
//        for (int i = 0; i < T; i++) {
//            st = new StringTokenizer(br.readLine());
//            int X = Integer.parseInt(st.nextToken()), Y = Integer.parseInt(st.nextToken());
//            int count = 0;
//            int total = Y-X;
//            boolean bool = true;
//            int j = 1;
//            while (total>0) {
//                total -= j;
//                if(bool == true) {
////                    System.out.println("한번실행");
//                    bool = false;
//                } else {
////                    System.out.println("두번실행");
//                    j += 1;
//                    bool = true;
//                }
//                count++;
//            }
//            System.out.println(count);
//        }
//    }
//}


}
