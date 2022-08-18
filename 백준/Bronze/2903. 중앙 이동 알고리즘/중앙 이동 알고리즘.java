import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write("" + totalPoint(n));

        br.close();
        bw.close();
    }

    public static int totalPoint(int n) {
        int num = 2;

        for (int i = 1; i <= n; i++) num = 2 * num - 1;

        return num * num;
    }
}
