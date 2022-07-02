package depthFirstSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        boolean t = true;
        int sum = 0;
        while (st.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");

            while(st2.hasMoreTokens())
                temp += Integer.parseInt(st2.nextToken());

            if(t) {
                sum = temp;
                t = false;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
