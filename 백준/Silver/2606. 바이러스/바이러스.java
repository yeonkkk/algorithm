
import java.io.*;
import java.util.*;


public class Main {

    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;

    private static void dfs(int node) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;

        for (int linkedNode : graph.get(node)) {
            dfs(linkedNode);
        }
    }

    public static void main(String[] args) throws IOException {
        /* input */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        /* 그래프 생성 */
        buildGraph(n, m, reader);
        visited = new boolean[n + 1];

        /* dfs 실행 */
        dfs(0);

        /* 방문 노드 카운트(시작 노드 제외) */
        int answer = countVisited() - 1;

        /* output */
        System.out.println(answer);
    }

    private static void buildGraph(int n, int m, BufferedReader reader) throws IOException {
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] inputLine = reader.readLine().split(" ");
            int node1 = Integer.parseInt(inputLine[0]) - 1;
            int node2 = Integer.parseInt(inputLine[1]) - 1;

            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }
    }

    private static int countVisited() {
        int count = 0;
        for (boolean result : visited) {
            if (result) count++;
        }
        return count;
    }
}
