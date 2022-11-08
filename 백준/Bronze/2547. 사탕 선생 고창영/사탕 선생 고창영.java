import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            calculator(br);
        }
    }

    public static void calculator(BufferedReader br) throws IOException {
        BigInteger candyNum = new BigInteger("0");
        int studentNum = Integer.valueOf(br.readLine());

        for (int i = 0; i < studentNum; i++) {
            candyNum = candyNum.add(new BigInteger(br.readLine()));
        }

        String remainder = String.valueOf(candyNum.remainder(BigInteger.valueOf(studentNum)));
        String result = remainder.equals("0") ? "YES" : "NO";

        System.out.println(result);
    }
}


