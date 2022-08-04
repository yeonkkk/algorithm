import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map = new HashMap();
        int total = 0;
        String result;

        for (int i = 0; i < 3; i++) {
            Integer key = Integer.valueOf(br.readLine());
            total += key;
            if (!map.containsKey(key)) map.put(key, 1);
            else map.put(key, map.get(key) + 1);
        }

        int n = map.size();

        if (total != 180) result = "Error";
        else result = n == 1 ? "Equilateral" : (n == 2 ? "Isosceles" : "Scalene");

        bw.write(result);
        br.close();
        bw.close();
    }
}
