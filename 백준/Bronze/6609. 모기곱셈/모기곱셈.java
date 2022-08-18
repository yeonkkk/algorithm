import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        while((str = br.readLine()) != null && !str.isEmpty()) {
            StringTokenizer st = new StringTokenizer(str);
            int m = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            for(int i = 0; i < n; i++) {
                int m2 = m;

                // 번데기 -> 성충
                m = p / s;

                // 유충 -> 번데기
                p = l / r;

                // 알 -> 유충
                l = m2 * e;
            }

            bw.write(String.format("%d%n", m));
        }
        br.close();
        bw.close();
    }
}
