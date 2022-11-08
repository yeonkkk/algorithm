import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            int total = Integer.valueOf(br.readLine());
            calculator(total);
        }
    }

    public static void calculator(int num) {
        int[] money =new int[]{25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();

        for (int m : money) {
            sb.append(num / m + " ");
            num %= m;
        }
        System.out.println(sb);
    }
}
