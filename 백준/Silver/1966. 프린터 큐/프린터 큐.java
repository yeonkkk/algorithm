import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println(printQ(n, m, numbers));
        }
    }

    private static int printQ(int n, int m, int[] numbers) {
        int[] sortedNumbers = Arrays.stream(numbers.clone()).sorted().toArray();
        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            q.add(i);
        }

        while (q.contains(m)) {
            int currentIndex = q.poll();

            if (numbers[currentIndex] == sortedNumbers[n - 1]) {
                n--;
                count++;
                continue;
            }

            q.add(currentIndex);
        }

        return count;
    }
}
