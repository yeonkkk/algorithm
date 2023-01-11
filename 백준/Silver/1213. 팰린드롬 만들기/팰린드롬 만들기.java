import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    private final static String FAIL_MESSAGE = "I'm Sorry Hansoo";
    private final static int ALPHA_START_NUM = 65;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println(solution(name));
    }

    private static String solution(String name) {
        int[] checkFrequency = new int[26];
        int countOdd = 0;
        StringBuilder result = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        for (char c : name.toCharArray()) {
            int index = c - ALPHA_START_NUM;
            checkFrequency[index]++;
        }

        StringBuilder start = new StringBuilder();

        for (int index = 0; index < checkFrequency.length; index++) {
            if (checkFrequency[index] % 2 != 0) {
                mid.append((char) (index + ALPHA_START_NUM));
                countOdd++;
            }

            if (countOdd > 1) {
                return FAIL_MESSAGE;
            }

            for (int i = 0; i < checkFrequency[index] / 2; i++) {
                start.append((char) (index + ALPHA_START_NUM));
            }
        }

        result.append(start)
                .append(mid)
                .append(start.reverse());

        return result.toString();
    }
}
