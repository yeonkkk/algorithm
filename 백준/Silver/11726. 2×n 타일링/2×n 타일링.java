import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ 11726. 2xn 타일링
 */
public class Main {
    /**
     * 점화식 f(n) = f(n-1) + f(n-2)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n + 1];
        nums[1] = 1;
        
        if (2 <= n) {
            nums[2] = 2;
        }

        for (int i = 3; i <= n; i++) {
            nums[i] = (nums[i - 1] + nums[i - 2]) % 10007;
        }

        System.out.println(nums[n]);
    }
}
