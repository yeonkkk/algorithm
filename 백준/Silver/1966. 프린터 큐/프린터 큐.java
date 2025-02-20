
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            String[] firstLine = reader.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int targetIndex = Integer.parseInt(firstLine[1]);

            String[] secondLine = reader.readLine().split(" ");

            Integer[] numbers = new Integer[n];
            Queue<Task> queue = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                int value = Integer.parseInt(secondLine[j]);
                Task task = new Task(j, value);
                queue.offer(task);
                numbers[j] = value;
            }
            Arrays.sort(numbers, (a, b) -> b - a);

            System.out.println(solution(targetIndex, numbers, queue));
        }
    }

    private static int solution(int targetIndex, Integer[] numbers, Queue<Task> queue) {
        for (int i = 0; i < numbers.length; i++) {
            int currentMaxValue = numbers[i];

            while (!queue.isEmpty()) {
                Task task = queue.poll();

                if (task.isSameValue(currentMaxValue)) {
                    if (task.isSameIndex(targetIndex)) {
                        return i + 1;
                    }
                    break;
                }

                queue.offer(task);
            }
        }

        return 0;
    }

    public static class Task {
        private int index;
        private int value;

        public Task(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public boolean isSameIndex(int other) {
            return this.index == other;
        }

        public boolean isSameValue(int other) {
            return this.value == other;
        }
    }
}

