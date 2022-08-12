import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a % 10 == 0) {
                bw.write(String.format("10%n"));
                continue;
            }

            int num = a % 10;
            for (int j = 1; j < b; j++)  num = num * a % 10;

            bw.write(String.format("%d%n", num));
        }
        br.close();
        bw.close();
    }
}