
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");

        int N = Integer.parseInt(firstLine[0]);
        int X = Integer.parseInt(firstLine[1]);

        String[] secondLine = reader.readLine().split(" ");
        int[] visitors = new int[N];
        for (int i = 0; i < N; i++) {
            visitors[i] = Integer.parseInt(secondLine[i]);
        }

        Solution solution = new Solution();
        int[] result = solution.solution(N, X, visitors);

        if (result[0] == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
    }
}

class Solution {

    int MAX_INDEX = 0;
    int COUNT_INDEX = 1;

    public int[] solution(int n, int x, int[] visitors) {
        /*
          result: {max, count}
         */
        int[] result = new int[2];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i >= x) {
                sum -= visitors[i - x];
            }
            sum += visitors[i];

            if (result[MAX_INDEX] < sum) {
                result[MAX_INDEX] = sum;
                result[COUNT_INDEX] = 1;
            } else if (sum == result[MAX_INDEX]) {
                result[COUNT_INDEX]++;
            }
        }
        return result;
    }
}
