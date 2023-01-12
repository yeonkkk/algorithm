import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] bridge = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] node = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(solution(bridge, node, n));
    }

    private static int solution(int[] bridge, int[] node, int n) {
        int index = n - 2;
        int result = 0;
        int count = 0;
        while (0 < index) {
            for (int i = index; 0 <= i; i--) {
                if (node[i] <= node[index]) {
                    index = i;
                }
            }

            for (int i = index; i < bridge.length; i++) {
                count += bridge[i];
            }

            result += count * node[index];
            count = 0;
            index--;
        }

        if (index == 0) {
            result += node[index] * bridge[index];
        }

        return result;
    }
}
