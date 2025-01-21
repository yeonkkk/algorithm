import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split(" ");

        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        String[] secondLine = reader.readLine().split(" ");
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(secondLine[i]);
        }

        System.out.println(solution(N, M, numbers));
    }

    private static int solution(int N, int M, int[] numbers) {
        int answer = 0;
        int start = 0;
        int end = 0;
        int sum = numbers[start];

        while (end < N) {
            if (sum < M) {
                end++;
                
                if (end < N) {
                    sum += numbers[end];
                }
            }

            if (sum == M) {
                answer++;
                sum -= numbers[start++];
            }

            if (sum > M) {
                sum -= numbers[start++];
            }
        }

        return answer;
    }
}
