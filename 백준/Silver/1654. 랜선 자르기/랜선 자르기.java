import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            String[] firstLine = reader.readLine().split(" ");
            int k = Integer.parseInt(firstLine[0]);
            int n = Integer.parseInt(firstLine[1]);

            long[] cables = new long[k];
            for (int i = 0; i < k; i++) {
                cables[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println(solution(k, n, cables));
        }
    }

    private static long solution(int k, int n, long[] cables) {
        Arrays.sort(cables);
        return binarySearch(k, n, cables);
    }

    private static long binarySearch(int k, int n, long[] cables) {
        long left = 1;
        long right = cables[k - 1];
        long maxLength = 1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long countCable = countCable(mid, cables);

            if (countCable < n) {
                right = mid - 1;
                continue;
            }

            maxLength = Math.max(mid, maxLength);
            left = mid + 1;
        }

        return maxLength;
    }

    private static long countCable(long target, long[]cables) {
        if (target == 0) {
            return 0;
        }

        return Arrays.stream(cables)
                .map(current -> current / target)
                .sum();
    }
}
