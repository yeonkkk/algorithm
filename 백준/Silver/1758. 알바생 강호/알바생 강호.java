
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            Integer[] tips = new Integer[n];

            for (int i = 0; i < n; i++) {
                tips[i] = Integer.valueOf(reader.readLine());
            }

            System.out.println(solution(n, tips));
        }
    }

    private static long solution(int n, Integer[] tips) {
        Arrays.sort(tips, Collections.reverseOrder());

        long totalTip = 0;
        for (int i = 0; i < n; i++) {
            int tip = tips[i] - i;

            if (tip <= 0) {
                return totalTip;
            }
            totalTip += tip;
        }

        return totalTip;
    }
}
