import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] storeArr = br.readLine().split(" ");

        int count = 0;
        String cur = "0";

        for (int i = 0; i < n; i++) {
            if (storeArr[i].equals(cur)) {
                count++;

                switch (cur) {
                    case "0":
                        cur = "1";
                        break;
                    case "1":
                        cur = "2";
                        break;
                    default:
                        cur = "0";
                }
                
            }
        }
        System.out.println(count);
    }
}