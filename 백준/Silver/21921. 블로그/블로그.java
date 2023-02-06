import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * BOJ 21921. 블로그
 */
public class Main {
    private static final String ZERO_NOTICE = "SAD";
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        solution(n, x);
    }

    private static void solution(int n, int x) throws IOException {
        int[] numbers = new int[n];
        int[] sums = new int[n - x + 1];
        int sum = 0;
        int left = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st2.nextToken());
            numbers[i] = current;

            if (x <= i) {
                sums[left] = sum;
                sum -= numbers[left];
                left++;
            }

            sum += current;
        }

        sums[left] = sum;

        int maxValue = Arrays.stream(sums).max().getAsInt();

        if (Arrays.stream(sums).sum() == 0) {
            System.out.println(ZERO_NOTICE);
        } else {
            System.out.println(maxValue);
            System.out.println(Arrays.stream(sums).filter(t -> t == maxValue).count());
        }
    }
}
