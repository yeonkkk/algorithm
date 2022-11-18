import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> count = new HashMap<>();
        Long maxKey = 0L;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            Long card = Long.valueOf(br.readLine());
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        for (Long key : count.keySet()) {
            int curValue = count.get(key);
            if (curValue == maxCount) {
                maxKey = maxKey < key ? maxKey : key;
                continue;
            } else if (maxCount < curValue) {
                maxCount = curValue;
                maxKey = key;
            }
        }

        System.out.println(maxKey);
    }
}