import java.util.*;


class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : array) {
            if (!map.containsKey(element)) {
                map.put(element, 0);
            }
            map.put(element, map.get(element) + 1);
        }

        Integer maxValue = Collections.max(map.values());

        int maxKey = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxKey = entry.getKey();
                count++;
            }
        }

        if (1 < count) {
            return -1;
        }

        return maxKey;
    }
}