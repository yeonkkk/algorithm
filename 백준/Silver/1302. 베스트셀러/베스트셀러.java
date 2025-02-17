
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        Map<String, Integer> bookCounter = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String book = reader.readLine();
            int count = bookCounter.getOrDefault(book, 1) + 1;

            bookCounter.put(book, count);
        }

        List<Map.Entry<String, Integer>> books = new ArrayList<>(bookCounter.entrySet());

        books.sort((e1, e2) -> {
            int valueDiff = e2.getValue().compareTo(e1.getValue());

            if (valueDiff != 0) {
                return valueDiff;
            }
            return e1.getKey().compareTo(e2.getKey());
        });

        Map.Entry<String, Integer> first = books.get(0);

        System.out.println(first.getKey());
    }
}