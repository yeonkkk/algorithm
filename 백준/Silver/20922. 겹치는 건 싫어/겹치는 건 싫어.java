import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제: 겹치는 건 싫어
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            String[] firstLine = reader.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);
            int[] numbers = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // 출력
            System.out.println(solution(n, k, numbers));
        }
    }

    private static int solution(int n, int k, int[] numbers) {
        int[] counter = new int[100_001];
        int left = 0;
        int right = 0;
        int maxlength = 0;

        while (left <= right && right < n) {
            int leftNumber = numbers[left];
            int rightNumber = numbers[right];

            if (counter[rightNumber] < k) {
                counter[rightNumber]++;
                right++;
            }else if (counter[rightNumber] == k) {
                counter[leftNumber]--;
                left++;
            }

            maxlength = Math.max(maxlength, right - left);

        }

        return maxlength;
    }
}
