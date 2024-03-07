import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * 문제: 트럭
 */

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            int[] firstLine = inputIntArray(reader);
            int n = firstLine[0];
            int w = firstLine[1];
            int l = firstLine[2];

            int[] truckWeights = inputIntArray(reader);
            System.out.println(solution(n, w, l, truckWeights));
        }
    }

    // int array 입력 및 변환 메서드
    private static int[] inputIntArray(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int solution(int n, int w, int l, int[] truckWeights) {
        Queue<Integer> queue = Arrays.stream(new int[w])
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        int truckCount = 0; // 다리를 지나온 트럭 수
        int time = 0; // 소요 시간
        int i = 0;

        while (!queue.isEmpty()) {
            time++;

            if (queue.size() == w) {
                if (queue.poll() != 0) {
                    truckCount++;
                }

                if (truckCount == n) {
                    break;
                }
            }

            int sumWeight = sumWeightByQueue(queue);

            if (i < n && sumWeight + truckWeights[i] <= l) {
                queue.add(truckWeights[i]);
                i++;
                continue;
            }
            queue.offer(0);
        }
        return time;
    }

    private static int sumWeightByQueue(Queue<Integer> queue) {
        return queue.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
