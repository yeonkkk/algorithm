import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * BOJ 15565. 귀여운 라이언
 */
public class Main {
    private static final String RYAN_NUM = "1";
    private static int n;
    private static int k;

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        List<Integer> index = new ArrayList<>();

        // RYAN_NUM 인덱스만 입력받기
        for (int i = 0; i < n; i++) {
            if (st.nextToken().equals(RYAN_NUM)) {
                index.add(i);
            }
        }

        System.out.println(solution(index));
    }

    private static int solution(List<Integer> index) {
        int minValue = n;

        for (int left = 0; left < index.size(); left++) {
            int right = left + k - 1;
            if (index.size() <= right) {
                break;
            }
            minValue = Math.min(minValue, index.get(right) - index.get(left) + 1);
        }

        return minValue == n ? -1 : minValue;
    }
}
