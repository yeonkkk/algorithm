import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int pre = 1;

        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(br.readLine());

            if (stack.isEmpty() || stack.peek() < cur) {
                for (int j = pre; j <= cur; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                pre = cur + 1;
            }

            if (stack.peek() == cur) {
                stack.pop();
                sb.append("-\n");
            }

        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}