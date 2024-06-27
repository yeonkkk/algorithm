import java.io.*;
import java.util.*;

// https://softeer.ai/practice/6253

public class Main {

    private static String solution(int numberA, int numberB) {
        if (numberA < numberB) {
            return "B";
        }

        if (numberB < numberA) {
            return "A";
        }

        return "same";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (reader) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int numberA = Integer.parseInt(tokenizer.nextToken());
            int numberB = Integer.parseInt(tokenizer.nextToken());

            System.out.println(solution(numberA, numberB));
        }
    }
}
