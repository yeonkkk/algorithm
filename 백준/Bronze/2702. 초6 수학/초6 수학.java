import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            int a = Integer.valueOf(nums[0]);
            int b = Integer.valueOf(nums[1]);

            int m =  gcd(a, b);
            int k = a * b / m;

            System.out.println(String.format("%d %d", k, m));
        }
    }

    public static int gcd(int a, int b) {
        int c;
        while (a % b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return b;
    }
}
