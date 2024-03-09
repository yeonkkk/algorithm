import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            Queue<Integer> queue = new LinkedList<>();
            int maxQueueSize = 0;
            int minStudentNum = n;

            for (int i = 0; i < n; i++) {
                String[] input = reader.readLine().split(" ");
                String command = input[0];

                if (command.equals("1")) {
                    int studentNum = Integer.parseInt(input[1]);
                    queue.offer(studentNum);


                    if (maxQueueSize < queue.size()) {
                        maxQueueSize = queue.size();
                        minStudentNum = studentNum;
                    }
                    
                    if (maxQueueSize == queue.size()) {
                        minStudentNum = Math.min(minStudentNum, studentNum);
                    }
                } else {
                    queue.poll();
                }
            }

            System.out.printf("%d %d", maxQueueSize, minStudentNum);
        }
    }
}