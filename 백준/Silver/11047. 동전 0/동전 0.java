import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        List<Integer> inputs = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(br.readLine());

            if (cur <= k) {
                inputs.add(cur);
            }
        }

        for (int i = inputs.size() - 1; 0 <= i; i--) {
            count += k / inputs.get(i);
            k %= inputs.get(i);

            if (k == 0) {
                break;
            }
        }

        System.out.println(count);
    }
}
