import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < n; j++) sum = sum.add(new BigInteger(br.readLine()));
            bw.write(String.format("%s%n", compare(sum)));
        }
        br.close();
        bw.close();
    }

    public static String compare(BigInteger sum) {
        BigInteger zero = new BigInteger("0");

        switch (sum.compareTo(zero)) {
            case -1: return "-";
            case 1: return "+";
            default: return "0";
        }
    }
}
