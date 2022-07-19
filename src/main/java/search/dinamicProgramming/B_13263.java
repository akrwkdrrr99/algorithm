package search.dinamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_13263 {
    static int n;
    static int[] a = new int[100001];
    static int[] b = new int[100001];
    static long[] dp = new long[100001];
    static ArrayList<Line> s = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        b = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {//a증가함수
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {//b감소함수
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; ++i) {
            Line g = new Line(b[i - 1], dp[i - 1]);

            while (s.size() >= 1) {
                g.s = cross(g, s.get(s.size() - 1));
                if (g.s < s.get(s.size() - 1).s) {
                    s.remove(s.size() - 1);
                } else break;
            }
            s.add(g);
            long x = a[i];
            int fpos = 0;

            int left = 0, right = s.size() - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (s.get(mid).s < x) {
                    fpos = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            dp[i] = s.get(fpos).a * x + s.get(fpos).b;
        }
        System.out.println(dp[n - 1]);
    }
    static class Line {
        long a, b;
        double s;

        Line(long a_, long b_) {
            a = a_;
            b = b_;
            s = 0;
        }
    }
    static double cross(Line l1, Line l2) {
        return (l2.b - l1.b) / (l1.a - l2.a);
    }
}