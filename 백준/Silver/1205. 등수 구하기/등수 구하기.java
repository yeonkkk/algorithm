import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(solution());
    }

    private static int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        if (n != 0) {
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            return calculator(p, score, numbers);
        }
        return 1;
    }

    private static int calculator(int p, int score, int[] numbers) {
        int duplication = 1;
        int count = 0;

        for (int number : numbers) {
            if (score < number) {
                count++;
            }

            if (score == number) {
                duplication++;
            }
        }

        int result = count + 1;
        if (p < duplication + count || p < result) {
            result = -1;
        }

        return result;
    }
}