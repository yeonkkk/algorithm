import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) stack.push(Integer.parseInt(br.readLine()));

        int curMax = stack.pop();
        int result = 1;

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (curMax < cur) {
                curMax = cur;
                result++;
            }
        }

        bw.write("" + result);
        br.close();
        bw.close();
    }
}
