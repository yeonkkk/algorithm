import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write("" + fibonacci(n));

        br.close();
        bw.close();
    }

    public static int fibonacci(int n) {

        int[] arr = new int[n + 1];

        if (n == 0 || n == 1) return n;
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) arr[i] = arr[i - 2] + arr[i - 1];

        return arr[n];
    }
}
