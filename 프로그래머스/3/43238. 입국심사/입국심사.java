import java.util.Arrays;

class Solution {
    
    public long solution(int n, int[] times) {
        Arrays.sort(times);

        long left = 0;
        long right = (long) times[times.length - 1] * n;
        long minTotalTime = Long.MAX_VALUE;

        while (left <= right) {
            long mid = (left + right) / 2;
            long countPeople = countPeople(times, mid);

            if (countPeople < n) {
                left = mid + 1;
            } else {
                minTotalTime = Math.min(minTotalTime, mid);
                right = mid - 1;
            }
        }
        
        return minTotalTime;
    }

    private long countPeople(int[] times, long totalTime) {
        return Arrays.stream(times)
                .mapToLong(time -> totalTime / time)
                .sum();
    }
}