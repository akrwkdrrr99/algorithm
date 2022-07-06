//package showMeTheDungeon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class one_1 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        StringTokenizer st = new StringTokenizer(s, " ");
//
//        int city = Integer.parseInt(st.nextToken());
//        int health = Integer.parseInt(st.nextToken());
//        int result = 0;
//        int[] deal = new int[city];
//        int[] member = new int [city];
//
//        s = br.readLine();
//        st = new StringTokenizer(s, " ");
//        for(int i=0; i<city; i++) {
//            deal[i] = Integer.parseInt(st.nextToken());
//        }
//
//        s = br.readLine();
//        st = new StringTokenizer(s, " ");
//        for(int i=0; i<city; i++) {
//            member[i] = Integer.parseInt(st.nextToken());
//        }
//
//        System.out.println(result);
//    }
//
//}
