import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int result = 0;
        int level = 1;
        int threshold = 10;

        for (int i = 1; i <= n; i++) {
            if (i == threshold) {
                level++;
                threshold *= 10;
            }
            result += level;
        }

        return result;
    }
}
