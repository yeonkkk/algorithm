import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());

        bw.write("" + distance(arr));
        br.close();
        bw.close();
    }

    public static int distance(int[] arr) {
        int a = arr[2] - arr[0];
        int b = arr[3] - arr[1];

        return min(min(a, b), min(arr[0], arr[1]));
    }
}
