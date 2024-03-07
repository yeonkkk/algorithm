import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 문제: 탑
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            Integer[] tops = Arrays.stream(reader.readLine().split(" "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);

            System.out.println(solution(n, tops));
        }
    }

    private static StringBuilder solution(int n, Integer[] tops) {
        LinkedList<Integer> stack = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int current = tops[i];

            while (!stack.isEmpty()) {
                int lastIndex = stack.peekLast();
                if (current <= tops[lastIndex]) {
                    result.append((lastIndex + 1) + " ");
                    break;
                }
                stack.pollLast();
            }

            if (stack.isEmpty()) {
                result.append("0 ");
            }

            stack.offerLast(i);
        }

        return result;
    }
}