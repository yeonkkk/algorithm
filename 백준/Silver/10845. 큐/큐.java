import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    private static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            solution(br.readLine());
        }
    }

    public static void solution(String str) {
        switch (str) {
            case "pop":
                System.out.println(q.isEmpty() ? -1 : q.removeFirst());
                break;
            case "size":
                System.out.println(q.size());
                break;
            case "empty":
                System.out.println(q.isEmpty() ? 1 : 0);
                break;
            case "front":
                System.out.println(q.isEmpty() ? -1 : q.peekFirst());
                break;
            case "back":
                System.out.println(q.isEmpty() ? -1 : q.peekLast());
                break;
            default:
                q.offerLast(Integer.parseInt(str.split(" ")[1]));
        }
    }
}
