import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제: 연속합
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            int n = Integer.parseInt(reader.readLine());
            int[] numbers = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // 출력
            System.out.println(solution(n, numbers));
        }
    }

    private static int solution(int n, int[] numbers) {
        int[] memo = new int[n];
        memo[0] = numbers[0];

        for (int i = 1; i < n; i++) {
            memo[i] = Math.max(memo[i - 1] + numbers[i], numbers[i]);
        }

        return Arrays.stream(memo).max().getAsInt();
    }
}
