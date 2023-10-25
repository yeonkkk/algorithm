import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = input[0];
        int m = input[1];
        int k = input[2];

        int winner = 0;
        int minCount = m + 1;

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[j];

                if (sum >= k) {
                    if (minCount > j) {
                        winner = i;
                        minCount = j;
                    }
                    break;
                }
            }
        }
        System.out.println((winner + 1) + " " + (minCount + 1));
    }
}
