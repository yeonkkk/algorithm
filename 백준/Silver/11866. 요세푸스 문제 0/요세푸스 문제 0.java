import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNums = br.readLine().split(" ");
        int n = Integer.valueOf(inputNums[0]);
        int k = Integer.valueOf(inputNums[1]);

        Queue<Integer> queue = new LinkedList<>();
        int count = k;
        StringBuilder result = new StringBuilder("<");

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!(queue.size() == 1)) {
            if (count > 1) {
                queue.add(queue.poll());
                count--;
                continue;
            }
            result.append(queue.poll() + ", ");
            count = k;
        }
        result.append(queue.poll() + ">");

        System.out.println(result);

        br.close();
    }
}