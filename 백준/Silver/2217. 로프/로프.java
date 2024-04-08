import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            int[] weights = new int[n];

            for (int i = 0; i < n; i++) {
                weights[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println(solution(n, weights));
        }
    }

    private static int solution(int n, int[] weights) {
        Arrays.sort(weights);

        int max = 0;
        for (int i = 0; i < n; i++) {
            int weight = weights[i] * (n - i);
            max = Math.max(max, weight);
        }

        return max;
    }
}
