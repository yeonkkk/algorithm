import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] abc = {300, 60, 10};
        String result = "" + t / abc[0];
        t = t % abc[0];

        for (int i = 1; i < abc.length; i++) {
            result += " " + t / abc[i];
            t = t % abc[i];
        }

        if (t == 0) bw.write(result);
        else bw.write("-1");

        br.close();
        bw.close();
    }
}
