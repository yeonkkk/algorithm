import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /* input */
        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);
        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(solution(N, K, coins));
    }

    private static int solution(int N, int K, int[] coins) {
        int answer = 0;

        for (int i = N - 1; i >= 0; i--) {
            int coin = coins[i];

            answer += K / coin;
            K %= coin;

            if (K == 0) {
                return answer;
            } 
        }

        return answer;
    }
}
