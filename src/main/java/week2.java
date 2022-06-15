import javax.management.Query;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

//todo: 10828 스택
//public class Main {
//    public static void main(String[] ars) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int T = Integer.parseInt(st.nextToken());
//        String first = "";
//        Stack<Integer> stack = new Stack<> ();
//        int num = 0;
//        int result = 0;
//        while(T>0) {
//            st = new StringTokenizer(br.readLine());
//            if(st.countTokens() == 1) {
//                first = st.nextToken();
//                if(first.equals("pop")) {
//                    result = stack.isEmpty() ? -1: stack.pop();
//                    System.out.println(result);
//                } else if(first.equals("size")) {
//                    result = stack.size();
//                    System.out.println(result);
//                } else if(first.equals("empty")) {
//                    result = stack.isEmpty() ? 1:0;
//                    System.out.println(result);
//                } else if(first.equals("top")) {
//                    result = stack.isEmpty() ? -1: stack.peek().intValue();
//                    System.out.println(result);
//                }
//            } else {
//                first = st.nextToken();
//                num = Integer.parseInt(st.nextToken());
//                stack.push(num);
//            }
//            T--;
//        }
//    }
//}

////todo: 10773 제로
//public class Main {
//    public static void main(String[] ars) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> money = new Stack<> ();
//        int all = 0;
//        int total = sc.nextInt();
//        for(int i =0; i< total; i++) {
//            int j = sc.nextInt();
//            if(j != 0) {
//                money.push(j);
//            } else {
//                money.pop();
//            }
//        }
//        while(money.size()>0) {
//            all += money.pop();
//        }
//        System.out.println(all);
//    }
//}

////todo: 18258 큐2
//public class Main {
//    public static void main(String[] ars) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int T = Integer.parseInt(st.nextToken());
//        String first = "";
//        Deque<Integer> queue = new LinkedList<>();
//        int num = 0;
//        int result = 0;
//        int last = 0;
//        while (T > 0) {
//            st = new StringTokenizer(br.readLine());
//            if (st.countTokens() == 1) {
//                first = st.nextToken();
//                if (first.equals("pop")) {
//                    result = queue.isEmpty() ? -1 : queue.poll();
//                    System.out.println(result);
//                } else if (first.equals("size")) {
//                    result = queue.size();
//                    System.out.println(result);
//                } else if (first.equals("empty")) {
//                    result = queue.isEmpty() ? 1 : 0;
//                    System.out.println(result);
//                } else if (first.equals("front")) {
//                    result = queue.isEmpty() ? -1 : queue.peek();
//                    System.out.println(result);
//                } else if (first.equals("back")) { // 이것만되면될듯
//                    result = queue.isEmpty() ? -1 : last;
//                    System.out.println(result);
//                }
//            } else {
//                first = st.nextToken();
//                num = Integer.parseInt(st.nextToken());
//                queue.offer(num);
//                last = num;
//            }
//            T--;
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        Deque<Integer> q = new LinkedList<>();
//
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer command;
//
//        while(N-- > 0) {
//            command = new StringTokenizer(br.readLine(), " ");	// 문자열 분리
//
//            switch(command.nextToken()) {
//
//                case "push":
//                    // offer는 큐의 맨 뒤에 요소를 추가한다.
//                    q.offer(Integer.parseInt(command.nextToken()));
//                    break;
//
//                case "pop" :
//                    /*
//                     *  poll은 가장 앞에 있는 요소를 삭제하며
//                     *  삭제할 원소가 없을 경우 예외를 던지는 것이 아닌 null을 반환한다.
//                     */
//                    Integer item = q.poll();
//                    if(item == null) {
//                        sb.append(-1).append('\n');
//                    }
//                    else {
//                        sb.append(item).append('\n');
//                    }
//                    break;
//
//                case "size":
//                    sb.append(q.size()).append('\n');
//                    break;
//
//                case "empty":
//                    if(q.isEmpty()) {
//                        sb.append(1).append('\n');
//                    }
//                    else {
//                        sb.append(0).append('\n');
//                    }
//                    break;
//
//                case "front":
//                    // peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
//                    Integer ite = q.peek();
//                    if(ite == null) {
//                        sb.append(-1).append('\n');
//                    }
//                    else {
//                        sb.append(ite).append('\n');
//                    }
//                    break;
//
//                case "back":
//                    // peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
//                    Integer it = q.peekLast();
//                    if(it == null) {
//                        sb.append(-1).append('\n');
//                    }
//                    else {
//                        sb.append(it).append('\n');
//                    }
//                    break;
//            }
//        }
//        System.out.println(sb);
//    }
//}

////todo: 1021 회전하는 큐
//public class Main {
//
//    public static void main(String[] ars) throws Exception {
//        int count = 0;
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        LinkedList<Integer> deque = new LinkedList<Integer>();
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        // 1부터 N까지 덱에 담아둔다.
//        for(int i = 1; i <= N; i++) {
//            deque.offer(i);
//        }
//        int[] seq = new int[M];	// 뽑고자 하는 수를 담은 배열
//
//        st = new StringTokenizer(br.readLine(), " ");
//        for(int i = 0; i < M; i++) {
//            seq[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i = 0; i < M; i++) {  // 5
//
//            // 덱에서 뽑고자 하는 숫자의 위치(index) 찾기
//            int target_idx = deque.indexOf(seq[i]); //[,6,7,8,9, 10, 1, 2,3, 4] 4
//
//            // 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
//            if(target_idx <= deque.size() / 2) { //
//                // idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
//                for(int j = 0; j < target_idx; j++) {
//                    int temp = deque.pollFirst();
//                    deque.offerLast(temp);
//                    count++;
//                }
//            }
//            else {	// 중간 지점보다 원소의 위치가 뒤에 있는 경우
//                // idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
//                for(int j = 0; j < ((deque.size() / 2) - target_idx); j++) {
//                    int temp = deque.pollLast();
//                    deque.offerFirst(temp);
//                    count++;
//                }
//
//            }
//            deque.pollFirst();
//
//        }
//
//        System.out.println(count);
//    }
//}

//public class Main {
//    public static void main(String[] ars) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++) {
//            String s = sc.next();
//
//            Stack<Character> stack = new Stack<>();
//            for(int j = 0; j<s.length(); j++) {
//                char c = s.charAt(i);
//
//                if(c == '(') {
//                    stack.push(c);
//                } else if (stack.empty()) {
//                    System.out.println("NO");
//                } else {
//                    stack.pop();
//                }
//            }
//
//            if (stack.empty()) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}

//public class Main {
//    public static String Solution(String s) {
//        String yesOrNo = "yes";
//        Stack<Character> stack = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++) {
//
//            char c = s.charAt(i);	// i 번째 문자
//
//            // 여는 괄호일 경우 스택에 push
//            if(c == '(' || c == '[') {
//                stack.push(c);
//            }
//
//            // 닫는 소괄호 일 경우
//            else if(c == ')') {
//
//                // 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
//                if(stack.empty() || stack.peek() != '(') {
//                    return "no";
//                }
//                else {
//                    stack.pop();
//                }
//            }
//
//            else if(c == ']') {
//
//                // 스택이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우
//                if(stack.empty() || stack.peek() != '[') {
//                    return "no";
//                }
//                else {
//                    stack.pop();
//                }
//            }
//
//            // 그 외의 경우에는 불필요한 문자들이기에 skip한다.
//        }
//
//        if(stack.empty()) {
//            return "yes";
//        }
//        else {
//            return "no";
//        }
//
//    }
//
//    public static void main(String[] ars) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String s;
//        while(true) {
//            s = br.readLine();
//            if(s.equals(".")) {
//                break;
//            }
//            sb.append(Solution(s)).append('\n');
//        }
//        System.out.println(sb);
//    }
// }

//Todo : 요세푸스의 순열 1차
//public class Main{
//    public static ArrayList<Integer> Calc(int total, int n) {
//        LinkedList<Integer> deque = new LinkedList<Integer>();
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        for(int i=1; i<=total; i++) {
//            deque.add(i);
//        }
//        while(!deque.isEmpty()) {
//            int role = n-1;
//            while(role>0) {
//                deque.addLast(deque.pollFirst()); // poll가능
//                role--;
//            }
//            result.add(deque.pollFirst());
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int total = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(Calc(total, n));
//    }
//}


//public class week2{
//    public static String Calc(int total, int n) {
//        StringBuilder sb = new StringBuilder();
//        LinkedList<Integer> deque = new LinkedList<Integer>();
//        for(int i=1; i<=total; i++) {
//            deque.add(i);
//        }
//        sb.append("<");
//        while(!deque.isEmpty()) {
//            int role = n-1;
//            while(role>0) {
//                deque.addLast(deque.pollFirst()); // poll가능
//                role--;
//            }
//            if(deque.size() == 1) {
//                sb.append(deque.pollFirst());
//            } else {
//                sb.append(deque.pollFirst() + ", ");
//            }
//        }
//        sb.append(">");
//        return sb.toString();
//    }
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int total =Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        bw.write(Calc(total, n) + "\n");
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}