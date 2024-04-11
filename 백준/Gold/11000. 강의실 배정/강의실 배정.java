
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            ClassTime[] classTimes = new ClassTime[n];

            for (int i = 0; i < n; i++) {
                String[] times = reader.readLine().split(" ");
                int start = Integer.parseInt(times[0]);
                int end = Integer.parseInt(times[1]);

                classTimes[i] = new ClassTime(start, end);
            }

            System.out.println(solution(n, classTimes));
        }
    }

    private static int solution(int n, ClassTime[] classTimes) {
        Arrays.sort(classTimes);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(classTimes[0].end);

        for (int i = 1; i < n; i++) {
            ClassTime classTime = classTimes[i];
            if (!queue.isEmpty() && classTime.isNext(queue.peek())) {
                queue.poll();
            }
            queue.add(classTime.end);
        }

        return queue.size();
    }

    static class ClassTime implements Comparable<ClassTime> {

        private final int start;
        private final int end;

        public ClassTime(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isNext(int endTime) {
            return endTime <= this.start;
        }

        @Override
        public int compareTo(ClassTime o) {
            if (this.start == o.start) {
                return this.end - o.end;
            }
            return this.start - o.start;
        }
    }
}
