import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Bmin = 2000;
        int Smin = 2000;

        for (int i = 0; i < 3; i++) {
            int cur = Integer.parseInt(br.readLine());
            if (cur <= Bmin) Bmin = cur;
        }

        for (int i = 0; i < 2; i++) {
            int cur = Integer.parseInt(br.readLine());
            if (cur <= Smin) Smin = cur;
        }

        bw.write(String.valueOf(Bmin + Smin - 50));
        br.close();
        bw.close();
    }
}
