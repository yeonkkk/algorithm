import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] inputs = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            inputs[i] = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
        }

        for (int[] input : inputs) {
            System.out.printf("%d ", solution(input, inputs));
        }
    }

    public static int solution(int[] p1, int[][] total) {
        int count = 1;
        for (int[] p2 : total) {
            if (p1[0] >= p2[0]) {
                continue;
            }

            if (p1[1] < p2[1]) {
                count++;
            }
        }

        return count;
    }
}
