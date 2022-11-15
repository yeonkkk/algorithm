import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int result = 5000;
        int count = 0;
        int remainder = 0;
        int k = n / 5;

        for (int i = 0; i <= k; i++) {
            int subN = n - 5 * i;
            count += i;
            remainder = subN % 3;

            if (remainder == 0) {
                count += subN / 3;
                result = result < count ? result : count;
            }
            count = 0;
        }
        return result == 5000 ? -1 : result;
    }
}
