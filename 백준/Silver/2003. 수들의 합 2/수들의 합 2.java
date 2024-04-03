import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int m = Integer.parseInt(reader.readLine().split(" ")[1]);
            int[] numbers = readNumbers(reader);

            System.out.println(solution(numbers, m));
        }
    }

    private static int solution(int[] numbers, int m) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int count = 0;

        while (left <= right && right < numbers.length) {
            if (currentSum < m) {
                currentSum += numbers[right];
                right++;
            }

            if (currentSum > m) {
                currentSum -= numbers[left];
                left++;
            }

            if (currentSum == m) {
                count++;
                currentSum -= numbers[left];
                left++;
            }
        }

        return count;
    }

    private static int[] readNumbers(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
