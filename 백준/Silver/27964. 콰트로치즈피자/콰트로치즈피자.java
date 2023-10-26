import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private final static String STANDARD_WORD = "Cheese";
    private final static String SUCCESS_WORD = "yummy";
    public static final int SUCCESS_COUNT = 4;
    private final static String FAIL_WORD = "sad";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<String> input = Arrays.stream(reader.readLine().split(" "))
                .distinct()
                .collect(Collectors.toList());

        if (SUCCESS_COUNT <= n && execute(input)) {
            System.out.println(SUCCESS_WORD);
            return;
        }
        System.out.println(FAIL_WORD);
    }

    private static boolean execute(List<String> input) {
        int count = 0;
        for (String s : input) {
            if (s.endsWith(STANDARD_WORD)) {
                count++;
            }

            if (count == SUCCESS_COUNT) {
                return true;
            }
        }
        return false;
    }
}
