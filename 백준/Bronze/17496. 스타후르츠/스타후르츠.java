import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String result = String.valueOf((n - 1)/t * c * p);
        bw.write(result);
        br.close();
        bw.close();
    }
}