import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[n + 1];
        Map<Integer, List<Integer>> graph = new HashMap<>();

        int m = Integer.parseInt(br.readLine());
        int count = -1;

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            int val1 = Integer.parseInt(input.split(" ")[0]);
            int val2 = Integer.parseInt(input.split(" ")[1]);

            updateValue(graph, val1, val2);
            updateValue(graph, val2, val1);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        while (!stack.isEmpty()) {
            int cur = stack.pop();

            if (check[cur]) {
                continue;
            }

            check[cur] = true;
            count++;

            for (int node : graph.get(cur)) {
                stack.push(node);
            }
        }
        System.out.println(count);
    }

    public static void updateValue(Map<Integer, List<Integer>> map, int val1, int val2) {
        if (!map.containsKey(val1)) {
            map.put(val1, new ArrayList<>());
        }
        map.get(val1).add(val2);
    }
}
