import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String rStr = br.readLine();
        String nStr = br.readLine();

        bw.write(compare(n, rStr, nStr) ? "Deletion succeeded" : "Deletion failed");
        br.close();
        bw.close();
    }

    public static boolean compare(int n, String str1, String str2) {

        if (n % 2 == 0) return str1.equals(str2);
        else {
            for (int i = 0; i < str1.length(); i++)
                if (str1.charAt(i) == str2.charAt(i)) return false;
            return true;
        }
    }
}
