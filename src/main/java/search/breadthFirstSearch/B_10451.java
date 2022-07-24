package search.breadthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10451 {
    static int[] map;
    static boolean[] visit;
    static int T, N;
    static int count;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for(int test=0; test<t; test++) {
            int n = Integer.parseInt(br.readLine());
            map = new int[n+1];
            count=0;

            st = new StringTokenizer(br.readLine());
            for(int i=1; i<n+1; i++) {
                map[i] = Integer.parseInt(st.nextToken());
            }

            visit = new boolean[n+1];
            for(int i=1; i<n+1; i++) {
                if(!visit[i]) {
                    dfs(i);
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int start) {
        visit[start]= true;

        int next= map[start];
        if(!visit[next]) {
            dfs(map[start]);
        }

    }


//    //Todo: dfs아닌 재귀방법
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        T = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//
//        for(int i =0; i< T; i++) {
//            //매회 세팅
//            count = 0; //count 초기화
//            N = Integer.parseInt(br.readLine());
//            map = new int[N+1];
//            for(int j=1; j<=N; j++) {
//                map[j] = j;
//            }
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            for(int j=1; j<=N; j++) {
//                int a = j;
//                int b = Integer.parseInt(st.nextToken());
//                Calc10451(a, b);
//            }
//            sb.append(count+"\n");
//        }
//        System.out.println(sb.toString());
//    }
//
//    //재귀 호출
//    static int find10451(int a) {
//        if(map[a] == a)
//            return a;
//
//        int result = find10451(map[a]);
//
//        return result;
//    }
//
//    // 결과 계산
//    static void Calc10451(int a, int b) {
//        a = find10451(a);
//        b = find10451(b);
//
//        if(a == b) {
//            count++;
//        } else if(a>b) {
//            map[a]= b;
//        } else {
//            map[b]= a;
//        }
//    }
}
