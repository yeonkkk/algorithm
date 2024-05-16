import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    private static List<Integer> solution(int n, int targetCost, int startCity, ArrayList<Integer>[] graph) {
        Queue<Integer> pq = new ArrayDeque<>();
        boolean[] visited = new boolean[n + 1];
        int[] distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startCity] = 0;
        pq.add(startCity);

        while (!pq.isEmpty()) {
            Integer current = pq.poll();
            if (visited[current]) {
                continue;
            }
            visited[current] = true;

            for (Integer nextCity : graph[current]) {
                if (distances[current] + 1 < distances[nextCity]) {
                    distances[nextCity] = distances[current] + 1;
                    pq.offer(nextCity);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            if (distances[i] == targetCost) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());
            int x = Integer.parseInt(tokenizer.nextToken());
            ArrayList<Integer>[] graph = new ArrayList[n + 1];

            for (int i = 0; i < n + 1; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                int start = Integer.parseInt(tokenizer.nextToken());
                int end = Integer.parseInt(tokenizer.nextToken());

                graph[start].add(end);
            }

            List<Integer> cities = solution(n, k, x, graph);

            if (cities.isEmpty()) {
                System.out.println(-1);
                return;
            }

            cities.sort(Integer::compareTo);
            for (Integer city : cities) {
                System.out.println(city);
            }
        }
    }
}
