import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int idx = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            bw.write(String.format("%d. %s%n", idx, game(n)));
            idx++;
        }

        br.close();
        bw.close();
    }

    public static String game(int n0) {
        String result = "";

        int n1, n2;
        n1 = 3 * n0;

        if (n1 % 2 == 0) {
            result += "even ";
            n2 = n1 / 2;
        } else {
            result += "odd ";
            n2 = (n1 + 1) / 2;
        }

        result += n2 / 3;

        return result;
    }
}
