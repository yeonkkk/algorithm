import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList();
        for (int i = 1; i <= n; i++) q.offer(i);

        String result = "";
        int check = 1;

        while (q.size() > 1) {
            if (check % 2 != 0) result += q.poll() + " ";
            else q.offer(q.poll());
            check += 1;
        }
        result += q.poll();

        bw.write(result);
        br.close();
        bw.close();
    }
}