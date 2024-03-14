import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());

            Map<Long, Integer> numberCounter = new HashMap<>();

            long maxKey = 0L;
            int maxValue = 0;
            for (int i = 0; i < n; i++) {
                long key = Long.parseLong(reader.readLine());
                int value = numberCounter.getOrDefault(key, 0) + 1;
                numberCounter.put(key, value);

                if (maxValue < value) {
                    maxKey = key;
                    maxValue = value;
                    continue;
                }

                if (maxValue == value) {
                    maxKey = Math.min(maxKey, key);
                }
            }
            System.out.println(maxKey);
        }
    }
}
