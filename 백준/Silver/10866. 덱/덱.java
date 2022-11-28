import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static Deque<String> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            solution(br.readLine());
        }
    }

    public static void solution( String input) {
        switch (input) {
            case "size":
                System.out.println(deque.size());
                break;
            case "empty":
                System.out.println(deque.isEmpty() ? 1 : 0);
                break;
            case "front":
                System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
                break;
            case "back":
                System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
                break;
            default:
                pushAndPop(input);
        }
    }

    public static void pushAndPop(String input) {
        String func = input.split(" ")[0].split("_")[0];
        String dir = input.split(" ")[0].split("_")[1];

        if ("push".equals(func)) {
            String val = input.split(" ")[1];
            if (dir.equals("front")) {
                deque.offerFirst(val);
            } else {
                deque.offerLast(val);
            }
        } else {
            if (!deque.isEmpty()) {
                if (dir.equals("front")) {
                    System.out.println(deque.pollFirst());
                } else {
                    System.out.println(deque.pollLast());
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}