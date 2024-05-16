import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static long solution(int n) {
        // dp 테이블 초기화
        long[][] dp = new long[n + 1][10];

        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = (dp[i - 1][j + 1]) % 1_000_000_000;
                    continue;
                }

                if (j == 9) {
                    dp[i][j] = (dp[i - 1][j - 1]) % 1_000_000_000;
                    continue;
                }

                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1_000_000_000;
            }
        }

        long result = 0;
        for (long number : dp[n]) {
            result += number;
        }

        return result % 1_000_000_000;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());

            System.out.println(solution(n));
        }
    }
}
