import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");
        String[] alNum = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int result = 0;

        for (String s : arr) {
            for (int i = 0; i < alNum.length; i++) {
                if (alNum[i].contains(s)) {
                    result += i + 3;
                    break;
                }
            }
        }

        bw.write("" + result);
        br.close();
        bw.close();
    }
}
