import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BOJ 24479. 알고리즘 수업 - 깊이 우선 탐색 1
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        Map<Integer, List<Integer>> graph = createGraph(m, br);
        printResult(startNode, n, graph);

    }

    public static void printResult(int startNode, int n, Map<Integer, List<Integer>> graph) throws IOException {
        int[] result = dfs(startNode, n, graph);

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] dfs(int startNode, int n, Map<Integer, List<Integer>> graph) {
        boolean[] check = new boolean[n + 1];
        int[] result = new int[n + 1];
        int count = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int curNode = stack.pop();

            if (check[curNode]) {
                continue;
            }

            check[curNode] = true;
            result[curNode] = count;

            addNextNode(graph, curNode, stack);
            count++;
        }

        return result;
    }

    public static void addNextNode(Map<Integer, List<Integer>> graph, int curNode, Stack<Integer> stack) {
        if (!graph.containsKey(curNode) || graph.get(curNode).isEmpty()) {
            return;
        }
        List<Integer> nextNodes = graph.get(curNode);

        Collections.sort(nextNodes, Collections.reverseOrder());

        for (int nextNode : nextNodes) {
            stack.push(nextNode);
        }
    }

    public static Map<Integer, List<Integer>> createGraph(int m, BufferedReader br) throws IOException {
        Map<Integer, List<Integer>> graph = new TreeMap<>();

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            insertNode(graph, u, v);
            insertNode(graph, v, u);
        }

        return graph;
    }

    public static void insertNode(Map<Integer, List<Integer>> graph, int key, int newValue) {
        if (!graph.containsKey(key)) {
            graph.put(key, new ArrayList<>());
        }
        List<Integer> value = graph.get(key);
        value.add(newValue);

        graph.put(key, value);
    }
}
