import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BOJ 11399. ATM
 */
public class Main {
    /**
     * n : 사람의 수
     * p : 각 사람이 돈을 인출하는데 걸리는 시간 배열 (" " 으로 분리하고 Int로 변환 후 정렬해서 입력 받음)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        System.out.println(sum(p, n));
    }

    /**
     * @param p: 정렬된 시간 목록
     * @param n: 사람 수
     * @return 각 사람이 돈을 인출하는데 걸린 시간의 총합
     *
     * 직전의 값을 계속 더해가면서 배열을 업데이트한 후 마지막에 배열 값을 모두 더한다.
     */
    public static int sum(int[] p, int n) {
        for (int i = 1; i <= n - 1; i++) {
            p[i] += p[i - 1];
        }
        return Arrays
                .stream(p)
                .sum();
    }
}
