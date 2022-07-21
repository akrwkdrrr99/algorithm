package search.depthFirstSearch;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

//todo: B_1260 인접행렬
public class DFSBasic {
    static int map[][];
    static boolean[] visit;
    static ArrayList<TreeMap<Integer, Integer>> arrayList;
    static int n,m,v;


    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i+" ");
        TreeMap<Integer, Integer> tmp = arrayList.get(i);
        for(int j: tmp.keySet()){
            if(visit[j] == false){
                dfs(j);
            }
        }
    }

    public static void bfs(int i){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visit[i] = true;

        //방문한 위치는 알아야하니까, 그것을 체크하기 위해서 visit가 필요.
        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp+" ");
            for(int k =1; k<=n; k++){
                if(map[temp][k]==1 && visit[k]==false){
                    q.offer(k);
                    visit[k] = true;
                }
            }
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map =new int[n+1][n+1];
        visit = new boolean[n+1];
        arrayList = new ArrayList<>();

        //초기화
        for(int j=0; j<n+1;j++){
            Arrays.fill(map[j], 0);
            arrayList.add(new TreeMap<Integer, Integer>());
        }
        Arrays.fill(visit, false);
        for(int i=0; i<m; i++){
            String edge = br.readLine();
            StringTokenizer st1 = new StringTokenizer(edge," ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            map[a][b]=1;
            map[b][a]=1;
            arrayList.get(a).put(b, a);
            arrayList.get(b).put(a, b);
        }
        dfs(v);
        System.out.println();
        Arrays.fill(visit, false);
        bfs(v);
    }
}


// todo: 재귀, 목록을 이용한 구현
//class DFSBasic{
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int nodeCount = sc.nextInt();
//        int lineCount = sc.nextInt();
//        int startNode = sc.nextInt();
//
//        Node[] nodes = new Node[nodeCount+1];
//        for(int i=0; i<nodeCount+1; i++)
//            nodes[i] = new Node(i);
//
//        for(int i=0; i<lineCount; i++){
//            int s = sc.nextInt();
//            int e = sc.nextInt();
//            nodes[s].addSide(nodes[e]);
//            nodes[e].addSide(nodes[s]);
//        }
//
//        for(Node n : nodes)
//            n.neighbours.sort(new Com());
//
//        DFS(nodes[startNode]);
//
//        System.out.println();
//        reset(nodes);
//
//        BFS(nodes[startNode]);
//    }
//
//    static void reset(Node[] nodes){
//        for(Node v : nodes)
//            v.visited=false;
//    }
//
//    static void DFS(Node node){
//
//        node.visited=true;
//        System.out.printf("%d",node.info);
//        List<Node> list = node.getSide();
//        for(Node n : list){
//            if(!n.visited) {
//                System.out.print(" ");
//                DFS(n);
//            }
//        }
//    }
//
//    static Queue<Node> queue = new LinkedList<>();
//    static void BFS(Node node){
//        node.visited = true;
//        queue.add(node);
//        System.out.print(node.info);
//
//        while(!queue.isEmpty()){
//            Node v = queue.remove();
//            List<Node> neigh = v.neighbours;
//
//            for(Node w : neigh){
//                if(!w.visited){
//                    System.out.print(" "+w.info);
//                    w.visited = true;
//                    queue.add(w);
//                }
//            }
//        }
//    }
//}
//
//class Com implements Comparator<Node>{
//    @Override
//    public int compare(Node o1, Node o2) {
//        return Integer.compare(o1.info, o2.info);
//    }
//}
//
//class Node {
//    int info;
//    boolean visited;
//    List<Node> neighbours; //인접 목록
//
//    Node(int info){ //생성자
//        this.info = info;
//        this.visited = false;
//        this.neighbours = new ArrayList<>();
//    }
//
//    public void addSide(Node n) { //인접 목록 채우기
//        this.neighbours.add(n);
//    }
//
//    public List<Node> getSide(){ //인접 목록 반환
//        return neighbours;
//    }
//
//    public void setSide(List<Node> n) { // 인접 목록 세팅
//        this.neighbours = n;
//    }
//
//    @Override
//    public String toString() { //출력 오버라이딩
//        return "" + info;
//    }
//}