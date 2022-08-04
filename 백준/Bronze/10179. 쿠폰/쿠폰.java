import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            double price = Double.parseDouble(br.readLine());
            bw.write(calculator(price));
        }

        br.close();
        bw.close();
    }

    public static String calculator(double price) {
        double result = Math.round(price * 0.8 * 100) / 100.0;
        return String.format("$%.2f%n", result);
    }
}
