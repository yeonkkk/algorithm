import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    public static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < t; i++) {
            calculator(Integer.parseInt(br.readLine()), dp);
        }
    }

    public static void calculator(int n, int[] dp) {
        for (int i = 4; i <= n; i++) {
            if (dp[n] != 0) {
                break;
            }
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        System.out.println(dp[n]);
    }
}