import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String date  = br.readLine();
        String[] carNum = br.readLine().split(" ");
        int count = 0;

        for (String car : carNum) {
            if (date.equals(car)) count++;
        }

        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}
