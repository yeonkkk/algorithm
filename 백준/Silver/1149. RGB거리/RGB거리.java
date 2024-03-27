import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * o 문제: RGB거리
 */

public class Main {

    public static final int RGB_COUNT = 3;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            int n = Integer.parseInt(reader.readLine());
            int[][] costs = new int[n][RGB_COUNT];

            for (int i = 0; i < n; i++) {
                costs[i] = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }

            // 출력
            System.out.println(solution(n, costs));
        }
    }

    private static int solution(int n, int[][] costs) {
        for (int i = 1; i < n; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
        }

        return Arrays.stream(costs[n - 1]).min().getAsInt();
    }
}
