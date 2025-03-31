
import java.io.*;
import java.util.*;


public class Main {

    private static String solution(int[] numbers, int[] targets) {
        StringBuilder result = new StringBuilder();

        for (int target : targets) {
            result.append(contains(target, numbers)).append("\n");
        }

        return result.toString();
    }

    private static int contains(int target, int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int current = numbers[mid];

            if (current < target) {
                left = mid + 1;
            } else if(current > target) {
                right = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /* input */
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted() // 정렬
                .toArray();

        int m = Integer.parseInt(reader.readLine());
        int[] targets = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /* output */
        System.out.println(solution(numbers, targets));
    }
}
