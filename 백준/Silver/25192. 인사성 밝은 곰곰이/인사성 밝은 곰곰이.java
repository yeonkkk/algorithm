import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(bufferedReader.readLine());
        }

        HashSet<String> hashSet = new HashSet<>();
        int result = 0;

        for (String s : list) {
            if (s.equals("ENTER")) {
                result += hashSet.size();
                hashSet = new HashSet<>();
                continue;
            }
            hashSet.add(s);
        }

        result += hashSet.size();

        System.out.println(result);
    }
}
