import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        switch (str) {
            case "1 2 3 4 5 6 7 8": bw.write("ascending"); break;
            case "8 7 6 5 4 3 2 1": bw.write("descending"); break;
            default: bw.write("mixed"); break;
        }

        br.close();
        bw.close();
    }
}
