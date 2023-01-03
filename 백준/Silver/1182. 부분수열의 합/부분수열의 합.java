import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    private static int N;
    private static int S;
    private static int answer = 0;
    private static int[] numbers;

    public static void main(String[] args) throws IOException {
        input();

        dfs(0, 0);

        output();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            checkSum(sum);
            return;
        }

        dfs(depth + 1, sum + numbers[depth]);
        dfs(depth + 1, sum);
    }

    private static void checkSum(int sum) {
        if (sum == S) {
            answer++;
        }
    }

    private static void output() {
        if (S == 0) {
            answer--;
        }

        System.out.println(answer);
    }
}
