import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        BigInteger a = new BigInteger(strArr[0]);
        BigInteger b = new BigInteger(strArr[1]);
        
        bw.write((a.add(b)).toString());
        
        br.close();
        bw.close();
    }
}
