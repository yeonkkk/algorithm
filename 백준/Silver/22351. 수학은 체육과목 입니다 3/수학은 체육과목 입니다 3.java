import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        List<String> strings = parseNumbers(input);

        if (strings.size() == 1) {
            System.out.println(strings.get(0) + " " + strings.get(0));
        } else {
            System.out.println(strings.get(0) + " " + strings.get(strings.size() - 1));
        }
    }

    private static List<String> parseNumbers(String input) {
        List<String> result = new ArrayList<>();
        int splitIdx = 1;
        int length = input.length();
        String start = input.substring(0, splitIdx);
        String backString = input.substring(splitIdx, length);

        while (!backString.isEmpty() && backString.length() <= length) {
            String nextNumber = String.valueOf(Integer.parseInt(start) + 1);

            if (backString.startsWith(nextNumber)) {
                result.add(start);
                start = nextNumber;
                splitIdx += nextNumber.length();
            } else {
                result = new ArrayList<>();
                splitIdx++;
                start = input.substring(0, splitIdx);
            }
            backString = input.substring(splitIdx, length);
        }

        result.add(start);

        return result;
    }
}
