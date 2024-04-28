import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] firstLine = reader.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int m = Integer.parseInt(firstLine[1]);

            int[] numbers1 = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] numbers2 = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println(solution(n, m, numbers1, numbers2));
        }
    }

    private static String solution(int n, int m, int[] numbers1, int[] numbers2) {
        StringBuilder result = new StringBuilder();
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < n && pointer2 < m) {
            if (numbers1[pointer1] < numbers2[pointer2]) {
                result.append(numbers1[pointer1]);
                pointer1++;
            } else {
                result.append(numbers2[pointer2]);
                pointer2++;
            }

            result.append(" ");
        }

        for (int i = pointer1; i < n; i++) {
            result.append(numbers1[i])
                    .append(" ");
        }


        for (int i = pointer2; i < m; i++) {
            result.append(numbers2[i])
                    .append(" ");
        }

        return result.toString();
    }
}
