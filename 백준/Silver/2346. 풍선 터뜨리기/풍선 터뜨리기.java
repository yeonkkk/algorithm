import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            int[] balloonValues = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.print(solution(n, balloonValues));
        }
    }

    private static StringBuilder solution(int n, int[] values) {
        StringBuilder result = new StringBuilder();

        ArrayDeque<Balloon> deque = IntStream.range(0, n)
                .mapToObj(i -> new Balloon(i + 1, values[i]))
                .collect(Collectors.toCollection(ArrayDeque::new));

        while (!deque.isEmpty()) {
            Balloon balloon = deque.pollFirst();
            result.append(balloon.getIndex()).append(" ");

            if (balloon.turnRight()) {
                for (int i = 0; i < balloon.getTurnCount() - 1; i++) {
                    if (!deque.isEmpty()) {
                        deque.offerLast(deque.pollFirst());
                    }
                }
            } else {
                for (int i = 0; i < balloon.getTurnCount(); i++) {
                    if (!deque.isEmpty()) {
                        deque.offerFirst(deque.pollLast());
                    }
                }
            }
        }
        return result;
    }

    public static class Balloon {

        private final int index;
        private final int paperValue;


        public Balloon(int index, int paperValue) {
            this.index = index;
            this.paperValue = paperValue;
        }

        public boolean turnRight() {
            return 0 < paperValue;
        }

        public int getTurnCount() {
            return Math.abs(paperValue);
        }

        public int getIndex() {
            return index;
        }
    }
}
