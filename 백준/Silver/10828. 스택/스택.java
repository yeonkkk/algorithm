import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            modifyStack(stack, input);
        }

        br.close();
    }

    public static void modifyStack(Stack<Integer> stack, String str) {
        switch (str) {
            case "pop":
                System.out.println(stack.empty() ? -1 : stack.pop());
                break;
            case "size":
                System.out.println(stack.size());
                break;
            case "empty":
                System.out.println(stack.empty() ? 1 : 0);
                break;
            case "top":
                System.out.println(stack.empty() ? -1 : stack.peek());
                break;
            default:
                stack.push(Integer.parseInt(str.split(" ")[1]));
        }
    }
}