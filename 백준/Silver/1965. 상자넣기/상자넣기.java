import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    // ----- 최장 증가 부분 수열 -----
    private static int solution(int n, int[] boxes) {
        int maxCount = 0;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (boxes[j] < boxes[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            maxCount = Math.max(maxCount, dp[i]);
        }

        return maxCount;
    }


    // ----- 입출력 -----
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int[] boxes = new int[n];

            for (int i = 0; i < n; i++) {
                boxes[i] = Integer.parseInt(tokenizer.nextToken());
            }

            System.out.println(solution(n, boxes));
        }
    }
}
