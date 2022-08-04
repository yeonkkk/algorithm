import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine(), 2);
        long b = Long.parseLong(br.readLine(), 2);

        bw.write(Long.toBinaryString(a * b));

        br.close();
        bw.close();
    }
}