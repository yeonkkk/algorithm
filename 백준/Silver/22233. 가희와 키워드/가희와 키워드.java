import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * BOJ 22233. 가희와 키워드
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Boolean> keywords = new HashMap<>();
        // 메모장에 적힌 키워드 입력 받기
        for (int i = 0; i < n; i++) {
            keywords.put(br.readLine(), true);
        }

        // 사용한 단어 입력 받기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), ",");

            while (st.hasMoreElements()) {
                String keyword = st.nextToken();

                if (keywords.containsKey(keyword)) {
                    keywords.remove(keyword);
                    n--;
                }
            }
            System.out.println(n);
        }
    }
}