import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//public class Week3 {
//    public class binarySearchTree {
//
//    }

//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int num = Integer.parseInt(st.nextToken());
//        LinkedList<Integer> TimeLine = new LinkedList<Integer>();
//        int totalTime = 0;
//        while(num>0) {
//            TimeLine.add(Integer.parseInt(st.nextToken()));
//            num--;
//        }
//        System.out.println(TimeLine.toArray().length);
//    }
//}

//public class Week3 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        int t = 1;  // 계속 곱해줄값. n! 5/ 4/ 3/ 2 /1
//        int r = 1;  // (n-r)! r! 3 2 /2 1 /1 0
//        int non = A-B;
//        while(A>0) {
//            t *= A;
//            if(non > 0) {
//                r*=non;
//                non--;
//            }
//            if(B >0) {
//                r*=B;
//                B--;
//            }
//            A--;
//        }
//        System.out.println(t / r);
//    }
//}
//Todo 최소공배수 1934
//public class Week3 {
//    // 공약수 구하기 유클리드 호제법
//    public static String Calc1934(int A, int B) {
//        StringBuilder sb = new StringBuilder();
//        int Max = A;
//        int Min = B;
//        int to = 0;
//        while(Min != 0) {
//            int r = Max % Min;
//            Max = Min;
//            Min = r;
//            if(r != 0) {
//                to = Min;
//            }
//        }
//        sb.append(A * B / to);
//        return sb.toString();
//    }
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int T = Integer.parseInt(st.nextToken());
//        while(T > 0) {
//            st = new StringTokenizer(br.readLine());
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//            if(T == 1) {
//                sb.append(Calc1934(A, B));
//            } else {
//                sb.append(Calc1934(A, B) + "\n");
//            }
//            T--;
//        }
//        bw.flush();
//        bw.write(sb.toString());
//        bw.close();
//    }
//}

//Todo 최대공약수와 최소공배수 2609
//public class Week3 {
//    // 공약수 구하기 유클리드 호제법
//    public static String Calc2609(int A, int B) {
//        StringBuilder sb = new StringBuilder();
//        int Max = Math.max(A, B);
//        int Min = Math.min(A, B);
//        int t = 0;
//        while(Min != 0) {
//            int r = Max % Min;
//            Max = Min;
//            Min = r;
//            if(r != 0) {
//                t = Min;
//            }
//        } // 공약수 를 구하는 식
//        sb.append(t + "\n");
//        sb.append(A * B / t);
//        return sb.toString();
//    }
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        System.out.println(Calc2609(A, B));
//    }
//}

//Todo 약수 1037
//public class Week3 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int Max = 0;
//        int Min = 0;
//        st = new StringTokenizer(br.readLine());
//        // 소수 일때
//        if(N == 1) {
//            int T = Integer.parseInt(st.nextToken());
//            System.out.println(T*T);
//        } else {
//            while(N > 0) {
//                int T = Integer.parseInt(st.nextToken());
//                if(Max == 0) {
//                    Max = T;
//                    Min = T;
//                } else {
//                    Max = Math.max(Max, T);
//                    Min = Math.min(Min, T);
//                }
//                N--;
//            }
//            System.out.println(Max*Min);
//        }
//    }
//}