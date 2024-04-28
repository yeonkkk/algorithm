import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

/**
 * 문제: 게으른 백곰
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            String[] firstLine = reader.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);

            int[] buckets = new int[1_000_001];
            int min = 1_000_001;
            int max = 0;
            for (int i = 0; i < n; i++) {
                String[] line = reader.readLine().split(" ");
                int g = Integer.parseInt(line[0]);
                int x = Integer.parseInt(line[1]);

                buckets[x] = g;
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            System.out.println(solution(k, min, max, buckets));
        }
    }

    private static int solution(int k, int min, int max, int[] buckets) {
        int left = min;
        int right = min;
        int sum = 0;
        int maxSum = 0;

        while (right <= max) {
            if (2 * k + 1 == right - left) {
                sum -= buckets[left];
                left++;
            }

            sum += buckets[right];
            right++;

            maxSum = Math.max(maxSum, sum);
        }

        return Math.max(sum, maxSum);
    }
}
