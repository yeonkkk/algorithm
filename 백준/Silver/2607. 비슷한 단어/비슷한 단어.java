import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * BOJ 2607. 비슷한 단어
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] standard = br.readLine().split("");
        int answer = 0;

        for (int i = 1; i < n; i++) {
            List<String> currentWord = new ArrayList<>(Arrays.asList(br.readLine().split("")));
            if (check(standard, currentWord)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static boolean check(String[] standard, List<String> currentWord) {
        int currentWordSize = currentWord.size();
        int count = 0;

        for (String element : standard) {
            if (!currentWord.isEmpty() && currentWord.contains(element)) {
                count++;
                currentWord.remove(element);
            }
        }

        if (currentWordSize < standard.length) {
            return count == standard.length - 1;
        } else if (currentWordSize > standard.length) {
            return count == standard.length && currentWordSize - 1 == standard.length;
        } else {
            return count == standard.length || count == standard.length - 1;
        }
    }
}
