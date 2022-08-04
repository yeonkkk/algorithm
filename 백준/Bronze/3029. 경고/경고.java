import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        
        int[] arr1 = Arrays.stream(s1.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(s2.split(":")).mapToInt(Integer::parseInt).toArray();

        int h = arr2[0] - arr1[0];
        int m = arr2[1] - arr1[1];
        int s = arr2[2] - arr1[2];

        if (s1.equals(s2)) {
            bw.write("24:00:00");
        } else {
            if (s < 0) {
                s += 60;
                --m;
            }
            if (m < 0) {
                m += 60;
                --h;
            }

            if (h < 0) h += 24;

            bw.write(String.format("%02d:%02d:%02d", h, m, s));
        }

        br.close();
        bw.close();
    }
}