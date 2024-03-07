import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 문제: 회전하는 큐
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().split(" ")[0]);
        int[] targets = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(n, targets));
    }

    public static int solution(int n, int[] targets) {
        LinkedList<Integer> deque = IntStream.range(1, n + 1)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        return Arrays.stream(targets)
                .map(target -> counterByTarget(target, deque))
                .sum();
    }

    private static int counterByTarget(int target, LinkedList<Integer> deque) {
        int count = 0;

        while (!deque.isEmpty()) {
            if (deque.peek() == target) {
                deque.pollFirst();
                return count;
            }
            int targetIndex = deque.indexOf(target);
            int lastIndex = deque.size() - 1;

            if (targetIndex <= lastIndex - targetIndex) {
                deque.offerLast(deque.pollFirst());
            } else {
                deque.offerFirst(deque.pollLast());
            }
            count++;
        }
        return count;
    }
}
