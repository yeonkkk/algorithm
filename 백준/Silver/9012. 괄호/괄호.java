
import java.io.*;
import java.util.*;


public class Main {

    public static final String FAIL_VPS = "NO";
    public static final String SUCCESS_VPS = "YES";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String ps = reader.readLine();
            String result = solution(ps);

            answer.append(result).append('\n');
        }

        System.out.println(answer);
    }

    private static String solution(String ps) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character current : ps.toCharArray()) {
            if (current == '(') {
                stack.addLast(current);
                continue;
            }

            if (stack.isEmpty()) {
                return FAIL_VPS;
            }
            stack.pollLast();
        }

        if (!stack.isEmpty()) {
            return FAIL_VPS;
        }
        return SUCCESS_VPS;
    }
}
