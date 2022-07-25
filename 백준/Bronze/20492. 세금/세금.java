import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());

        long result1 = (long) (n * (1 - 0.22));
        long result2 = (long) (n * (1 - 0.2 * 0.22));

        bw.write(String.format("%d %d", result1, result2));
        br.close();
        bw.close();
    }
}
