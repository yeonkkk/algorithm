
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 문제: n단 논법
 */

public class Main {

    static class Pair {

        private final String start;
        private final String end;

        Pair(String start, String end) {
            this.start = start;
            this.end = end;
        }
    }

    private static String solution(Map<String, String> graph, Pair[] pairs) {
        StringBuilder result = new StringBuilder();

        first: for (Pair pair : pairs) {
            Queue<String> queue = new LinkedList<>();
            List<String> visited = new ArrayList<>();
            queue.offer(pair.start);

            while (!queue.isEmpty()) {
                String current = queue.poll();

                if (current.equals(pair.end)) {
                    result.append("T\n");
                    continue first;
                }

                if (visited.contains(current)) {
                    continue;
                }

                visited.add(current);

                if (graph.containsKey(current)) {
                    queue.add(graph.get(current));
                }
            }

            result.append("F\n");
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            Map<String, String> graph = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String[] line = reader.readLine().split(" ");
                String start = line[0];
                String end = line[2];

                graph.put(start, end);
            }

            int m = Integer.parseInt(reader.readLine());
            Pair[] pairs = new Pair[m];

            for (int i = 0; i < m; i++) {
                String[] line = reader.readLine().split(" ");
                String start = line[0];
                String end = line[2];

                pairs[i] = new Pair(start, end);
            }

            System.out.println(solution(graph, pairs));
        }
    }
}
