import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger numA = new BigInteger(br.readLine());
        String op = br.readLine();
        BigInteger numB = new BigInteger(br.readLine());

        bw.write("" + calculator(numA, numB, op));
        br.close();
        bw.close();
    }

    public static BigInteger calculator(BigInteger num1, BigInteger num2, String op) {
        if (op.equals("*")) return num1.multiply(num2);
        else return num1.add(num2);
    }
}
