import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 계단 오르기
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            int n = Integer.parseInt(reader.readLine());
            int[] stairs = new int[n];

            for (int i = 0; i < n; i++) {
                stairs[i] = Integer.parseInt(reader.readLine());
            }

            // 출력
            System.out.println(solution(n, stairs));
        }
    }

    private static int solution(int n, int[] stairs) {
        int[] dp = new int[n];

        if (1 <= n) dp[0] = stairs[0];
        if (2 <= n) dp[1] = stairs[0] + stairs[1];
        if (3 <= n) dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i]);
        }

        return dp[n-1];
    }
}
