import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[][] isPossible;
    static int weightCount;

    private static String solution(int[] weights, int[] marbles) {
        StringBuilder result = new StringBuilder();
        isPossible = new boolean[weightCount + 1][40_000 + 1];
        dp(0, 0, weights);

        first: for (int marble : marbles) {
            for (int i = 0; i <= weightCount; i++) {
                if (isPossible[i][marble]) {
                    result.append("Y ");
                    continue first;
                }
            }
            result.append("N ");
        }
        return result.toString();
    }

    private static void dp(int count, int weight, int[] weights) {
        if (isPossible[count][weight]) {
            return;
        }
        isPossible[count][weight] = true;

        if (count == weightCount) {
            return;
        }

        dp(count + 1, weight + weights[count] , weights);
        dp(count + 1, weight, weights);
        dp(count + 1, Math.abs(weight - weights[count]) , weights);
    }

    // ----- 입출력 -----
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            weightCount = Integer.parseInt(reader.readLine());
            int[] weights = new int[weightCount];
            String[] weightLine = reader.readLine().split(" ");
            for (int i = 0; i < weightCount; i++) {
                weights[i] = Integer.parseInt(weightLine[i]);
            }

            int marbleCount = Integer.parseInt(reader.readLine());
            int[] marbles = new int[marbleCount];
            String[] marbleLine = reader.readLine().split(" ");
            for (int i = 0; i < marbleCount; i++) {
                marbles[i] = Integer.parseInt(marbleLine[i]);
            }

            System.out.println(solution(weights, marbles));
        }
    }
}
