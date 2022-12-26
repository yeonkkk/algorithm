import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int sum = 0;
        List<Character> inputs = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
            inputs.add(n.charAt(i));
        }

        Collections.sort(inputs, Collections.reverseOrder());
        System.out.println(calculator(inputs, sum));
    }

    public static String calculator(List<Character> inputs, int sum) {
        StringBuilder sb = new StringBuilder();

        if (!inputs.contains('0') || sum % 3 != 0) {
            return "-1";
        }

        for (Character num : inputs) {
            sb.append(num);
        }

        return sb.toString();
    }
}
