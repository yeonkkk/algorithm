import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();

        for (int i = 0 ; i < arr.length; i++) {
            String tmp = Integer.toBinaryString(arr[i] - '0');
            if (i != 0 && tmp.length() < 3) sb.append(tmp.length() == 1 ? "00" : "0");
            sb.append(tmp);
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}
