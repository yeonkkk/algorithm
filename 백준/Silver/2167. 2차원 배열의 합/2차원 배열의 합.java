import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[][] graph = readGraph(reader);
            int k = Integer.parseInt(reader.readLine());
            int[][] points = readPoints(reader, k);

            calculateSumByPoint(graph, points);
        }
    }

    private static void calculateSumByPoint(int[][] graph, int[][] points) {
        for (int[] point : points) {
            int i = point[0] - 1;
            int j = point[1] - 1;
            int x = point[2] - 1;
            int y = point[3] - 1;

            int sum = calculatePrefixSum(graph, i, x, j, y);
            System.out.println(sum);
        }
    }

    private static int calculatePrefixSum(int[][] graph, int i, int x, int j, int y) {
        int sum = 0;
        
        for (int k = i; k <= x; k++) {
            for (int l = j; l <= y; l++) {
                sum += graph[k][l];
            }
        }
        return sum;
    }

    private static int[][] readGraph(BufferedReader reader) throws IOException {
        String firstLine = reader.readLine();
        n = Integer.parseInt(firstLine.split(" ")[0]);
        m = Integer.parseInt(firstLine.split(" ")[1]);

        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            graph[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return graph;
    }

    private static int[][] readPoints(BufferedReader reader, int k) throws IOException {
        int[][] points = new int[k][];
        for (int i = 0; i < k; i++) {
            points[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return points;
    }
}
