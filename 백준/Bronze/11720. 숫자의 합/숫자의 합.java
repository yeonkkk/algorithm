import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(solution());
    }

    public static int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        return Arrays.stream(br.readLine().split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}
