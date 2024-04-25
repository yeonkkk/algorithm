import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 회문
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            int n = Integer.parseInt(reader.readLine());
            String[] words = new String[n];

            for (int i = 0; i < n; i++) {
                words[i] = reader.readLine().strip();
            }

            // 출력
            System.out.println(solution(words));
        }
    }

    private static String solution(String[] words) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(checkPalindromeType(0, word.length() - 1, 0, word))
                    .append("\n");
        }
        return result.toString();
    }

    private static int checkPalindromeType(int left, int right, int count, String word) {
        if (2 <= count) {
            return 2;
        }

        while (left < right) {
            if (word.charAt(left) == word.charAt(right)) {
                left++;
                right--;
            } else {
                int changedLeft = checkPalindromeType(left + 1, right, count + 1, word);
                int changedRight = checkPalindromeType(left, right - 1, count + 1, word);
                return Math.min(changedLeft, changedRight);
            }
        }

        return count;
    }
}