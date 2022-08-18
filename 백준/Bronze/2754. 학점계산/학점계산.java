import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write("" + converter(str));
        br.close();
        bw.close();
    }

    public static double converter(String str) {

        if (str.equals("F")) return 0.0;

        double result = 69 - str.charAt(0);
        char b = str.charAt(1);

        if (b == '+') result += 0.3;
        else if (b == '-') result -= 0.3;

        return result;
    }
}


