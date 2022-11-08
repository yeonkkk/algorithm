import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        int pre = 0;
        int cur = 0;
        int result;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int num = Integer.valueOf(input);
            cur += num;

            if (cur >= 100) {
                break;
            }
            pre = cur;
        }

        result = Math.abs(100 - cur) > Math.abs(100 - pre) ? pre : cur;
        System.out.println(result);
    }
}
