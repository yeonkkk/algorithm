import java.io.*;
import java.util.*;

https://softeer.ai/practice/7698

public class Main {

    private static String solution(int voteCount) {
        int quotient = voteCount / 5;
        int remainder = voteCount % 5;

        StringBuilder result = new StringBuilder();
        result.append("++++ ".repeat(quotient)).append("|".repeat(remainder));

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (reader) {
            int testCaseCount = Integer.parseInt(reader.readLine());

            for (int i = 0; i < testCaseCount; i++) {
                int voteCount = Integer.parseInt(reader.readLine());

                System.out.println(solution(voteCount));
            }
        }
    }
}
