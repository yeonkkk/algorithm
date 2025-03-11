import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /* input */
        int N = Integer.parseInt(reader.readLine());
        int[] points = new int[N];

        String[] numberLine = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(numberLine[i]);
        }

        System.out.println(solution(N, points));
    }

    private static String solution(int N, int[] points) {
        StringBuilder result = new StringBuilder();
        int[] sorted = points.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> check = checkPrev(sorted);

        for (int i = 0; i < N; i++) {
            int number = points[i];

            result.append(check.get(number)).append(" ");
        }

        return result.toString().strip();
    }

    private static Map<Integer, Integer> checkPrev(int[] sorted) {
        Map<Integer, Integer> check = new HashMap<>();
        int prev = 0;

        for (int number : sorted) {
            if (check.containsKey(number)) {
                continue;
            }

            check.put(number, prev);
            prev++;
        }

        return check;
    }
}

