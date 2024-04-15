import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제: 숫자 카드
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            int[] numberCards = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int m = Integer.parseInt(reader.readLine());
            int[] numbers = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println(solution(numberCards, numbers));
        }
    }

    private static String solution(int[] numberCards, int[] numbers) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(numberCards);

        for (int number : numbers) {
            if (binarySearch(numberCards, number)) {
                result.append("1 ");
                continue;
            }
            result.append("0 ");
        }

        return result.toString();
    }

    private static boolean binarySearch(int[] numberCards, int target) {
        int left_index = 0;
        int right_index = numberCards.length - 1;

        while (left_index <= right_index) {
            int mid_index = (right_index + left_index) / 2;
            if (numberCards[mid_index] == target) {
                return true;
            }

            if (numberCards[mid_index] < target) {
                left_index = mid_index + 1;
                continue;
            }

            if (numberCards[mid_index] > target) {
                right_index = mid_index - 1;
            }
        }

        return false;
    }
}
