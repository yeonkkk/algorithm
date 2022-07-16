import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        int t = 0;

        for (int i = 5; i > 0; i--) {
            t += n / i;
            n = n % i;
            if (n == 0) break;
        }

        bw.write(String.valueOf(t));

        br.close();
        bw.close();
    }
}
