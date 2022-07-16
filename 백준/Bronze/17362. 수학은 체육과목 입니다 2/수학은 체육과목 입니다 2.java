import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n = Long.parseLong(br.readLine()) - 5;
        Long m = n / 4;
        long r = n % 4;
        Long result;


        if (n <= 0) result = n + 5;
        else if (m % 2 == 0) {
            if (r == 0) result = 5L;
            else result = 5 - r;
        } else {
            if (r == 0) result = 1L;
            else result = r + 1;
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}
