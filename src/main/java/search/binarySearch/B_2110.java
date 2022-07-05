package search.binarySearch;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2110 {
    public static int[] posArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int count  = Integer.parseInt(st.nextToken());
        posArr = new int[N];

        for(int i=0;i<N; i++) {
            posArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(posArr);

        int max = posArr[N-1] - posArr[0] + 1;
        int min = 1;

        while(min < max) {
            int mid = (min + max) / 2;

            if(calcCount(mid) < count) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }

    public static int calcCount(int distance) {
        //초기값
        int count = 1;
        int lastPos = posArr[0];

        for(int i=1; i< posArr.length; i++) {
            int localPos = posArr[i];

            if(localPos - lastPos >= distance ) {
                count++;
                lastPos = localPos;
            }
        }

        return count;
    }
}
