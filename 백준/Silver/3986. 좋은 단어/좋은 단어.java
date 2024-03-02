import java.io.*;
import java.util.*;

/**
 * 문제: 좋은 단어
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = reader.readLine();
        }

        System.out.println(solution(words));
    }

    public static int solution(String[] words) {
        int count = 0;
        for (String word : words) {
            if (isGoodWord(word)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isGoodWord(String word) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char c : word.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        return stack.isEmpty();
    }
}