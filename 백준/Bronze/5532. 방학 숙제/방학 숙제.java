import java.io.*;

import static java.lang.Math.ceil;
import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) arr[i] = Double.parseDouble(br.readLine());

        int result = (int) (arr[0] - ceil(max(arr[1] / arr[3], arr[2] / arr[4])));

        bw.write("" + result);
        br.close();
        bw.close();
    }
}
