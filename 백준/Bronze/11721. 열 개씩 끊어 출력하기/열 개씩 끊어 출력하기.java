import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            bw.write(str.charAt(i));
            if(i != 0 && (i+1) % 10 == 0) bw.write(String.format("%n"));
        }

        br.close();
        bw.close();
    }
}