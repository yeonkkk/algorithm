import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * BOJ 2002. 추월
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<String> input = new LinkedList<>();
        List<String> blackList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input.add(br.readLine());
        }

        while (!input.isEmpty()) {
            String current = input.poll();

            if (blackList.contains(current)) {
                continue;
            }

            while (true) {
                String output = br.readLine();
                if (!current.equals(output)) {
                    blackList.add(output);
                    continue;
                }

                break;
            }
        }

        System.out.println(blackList.size());
    }
}
