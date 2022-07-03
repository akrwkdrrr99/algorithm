package search.allFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//todo: 숫자야구 - 완전탐색 풀이
public class B_2503 {
    static int n;
    static List<BaseBallData> inputData = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int data = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            BaseBallData baseBallData = new BaseBallData(data, strike, ball);
            inputData.add(baseBallData);
        }

        System.out.println(calBaseBall());
    }

    static int calBaseBall() {
        int result = 0;

        for (int i = 123; i <= 987; i++) {
            if (!checkSameNum(i)) continue; // 중복숫자

            int allTestPass = 0;

            for (int j = 0; j < n; j++) {
                int strikeCount = 0;
                int ballCount = 0;

                BaseBallData current = inputData.get(j);
                String currentDataString = Integer.toString(current.data);
                String myDataString = Integer.toString(i);

                for (int k = 0; k < 3; k++) { // strike
                    if (currentDataString.charAt(k) == myDataString.charAt(k)) {
                        strikeCount++;
                    }
                }

                for (int h = 0; h < 3; h++) {
                    for (int u = 0; u < 3; u++) {
                        if (myDataString.charAt(h) == currentDataString.charAt(u)) { // ball
                            if (h != u)
                                ballCount++;
                        }
                    }
                }

                if (current.strike == strikeCount && current.ball == ballCount) {
                    allTestPass++;
                }
            }
            if (allTestPass == n) {
                result++;
            }
        }
        return result;
    }

    static boolean checkSameNum(int num) {

        String numString = Integer.toString(num);

        if (numString.charAt(0) == numString.charAt(1)) {
            return false;
        }

        if (numString.charAt(1) == numString.charAt(2)) {
            return false;
        }

        if (numString.charAt(0) == numString.charAt(2)) {
            return false;
        }

        if (numString.charAt(0) == '0' || numString.charAt(1) == '0' || numString.charAt(2) == '0')
            return false;

        return true;
    }

    static class BaseBallData {
        int data;
        int strike;
        int ball;

        public BaseBallData(int data, int strike, int ball) {
            this.data = data;
            this.strike = strike;
            this.ball = ball;
        }
    }
//        public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String [] MH = new String[N];
//
//        int [][] MH_info = new int[N][2];
//
//        for (int i = 0; i<N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            MH[i] = st.nextToken();
//            MH_info[i][0] = Integer.parseInt(st.nextToken());
//            MH_info[i][1] = Integer.parseInt(st.nextToken());
//        }
//
//        int ans = 0;
//        for (int i= 1; i<=9; i++) {
//            for (int j= 1; j<=9; j++) {
//                if(i != j) {
//                    for (int k = 1; k <= 9; k++) {
//                        if(i != k && j != k) {
//                            boolean flag = true;
//                            for(int s =0; s<N; s++) {
//                                int strike = 0;
//                                int ball = 0;
//                                String str = MH[s];
//                                if(str.charAt(0) - '0' == i)
//                                    strike++;
//                                if(str.charAt(1) - '0' == j)
//                                    strike++;
//                                if(str.charAt(2) - '0' == k)
//                                    strike++;
//                                if(str.charAt(0) - '0' == j || str.charAt(0) - '0' == k)
//                                    ball++;
//                                if(str.charAt(1) - '0' == i || str.charAt(0) - '0' == k)
//                                    ball++;
//                                if(str.charAt(2) - '0' == i || str.charAt(0) - '0' == j)
//                                    ball++;
//                                if(MH_info[s][0] != strike || MH_info[s][1] !=ball) {
//                                    flag =false;
//                                    break;
//                                }
//                            }
//                            if(flag)
//                                ans++;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(ans);
//    }
}
