import java.io.*;

public class Main {

    private static int solution(int[] numbers, int n) {
        int[] counter = new int[n];

        for (int i = 0; i < n; i++) {
            int current = numbers[i];

            // 초기화
            counter[i] = 1;

            for (int j = 0; j < i; j++) {
                int other = numbers[j];

                if (current > other) {
                    counter[i] = Math.max(counter[i], counter[j] + 1);
                }
            }
        }

        // max 값 탐색
        int answer = 0;
        for (int count : counter) {
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        /* input */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] stringNumbers = reader.readLine().split(" ");
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        System.out.println(solution(numbers, n));
    }
}
