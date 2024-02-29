import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        System.out.print(solution(s));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                break;
            }

            if (c == '(') {
                stack.push(c);
            }

            if (c == ')' & !stack.empty()) {
                stack.pop();
            }
        }

        return stack.size();
    }
}