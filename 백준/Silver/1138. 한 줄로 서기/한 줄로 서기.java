import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] people = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(solution(n, people));
    }

    private static String solution(int n, int[] people) {
        List<String> result = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            result.add(people[i], String.valueOf(i + 1));
        }

        return String.join(" ", result);
    }
}
