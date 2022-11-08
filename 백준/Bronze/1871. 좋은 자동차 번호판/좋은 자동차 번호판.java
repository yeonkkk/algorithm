import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            verifyValue(br);
        }
    }

    public static void verifyValue(BufferedReader br) throws IOException {
        String[] input = br.readLine().split("-");
        double value = 0;

        for (int i = 0; i < input[0].length(); i++) {
            int cur = input[0].charAt(i) - 65;
            value += cur * Math.pow(26, 2 - i);
        }

        int inputNum = Integer.valueOf(input[1]);

        String result = Math.abs(inputNum - value) <= 100 ? "nice" : "not nice";
        System.out.println(result);
    }
}
