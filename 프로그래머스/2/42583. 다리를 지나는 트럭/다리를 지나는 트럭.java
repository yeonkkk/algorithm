import java.util.*;

class Solution {
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(truck_weights[0]);
        int truckCount = truck_weights.length;
        int idx = 1;
        int time = 1;
        int weightCount = 0;

        while (!queue.isEmpty()) {
            time++;

            if (queue.size() == bridge_length) {
                if (queue.poll() != 0) {
                    weightCount++;
                }

                if (weightCount == truckCount) {
                    break;
                }
            }

            if (idx < truckCount && truck_weights[idx] + sumWeight(queue) <= weight) {
                queue.offer(truck_weights[idx]);
                idx++;
                continue;
            }

            queue.offer(0);
        }

        return time;
    }

    private int sumWeight(Queue<Integer> queue) {
        return queue.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}