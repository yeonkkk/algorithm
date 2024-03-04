import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> processQueue = IntStream.range(0, priorities.length)
                .mapToObj(i -> new Process(priorities[i], i))
                .collect(Collectors.toCollection(LinkedList::new));

        Arrays.sort(priorities);
        return getOrderByPriorityAndLocation(priorities, location, processQueue);
    }

    private int getOrderByPriorityAndLocation(int[] priorities, int location, Queue<Process> processQueue) {
        int result = 0;
        int idx = priorities.length - 1;
        int order = 1;

        while (!processQueue.isEmpty()) {
            int currentPriority = priorities[idx];
            Process process = processQueue.poll();

            if (process.isNotSamePriority(currentPriority)) {
                processQueue.offer(process);
                continue;
            }

            if (process.isSameLocation(location)) {
                return order;
            }

            order++;
            idx--;
        }
        return result;
    }
}

class Process {

    private final int priority;
    private final int location;

    Process(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }

    public boolean isNotSamePriority(int priority) {
        return this.priority != priority;
    }

    public boolean isSameLocation(int location) {
        return this.location == location;
    }
}