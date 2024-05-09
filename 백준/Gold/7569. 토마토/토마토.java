import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    static int[] dz = { 0, 0, 0, 0, -1, 1 };
    static int[] dy = { 0, 0, -1, 1, 0, 0 };
    static int[] dx = { -1, 1, 0, 0, 0, 0 };
    static int m;
    static int n;
    static int h;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
            m = Integer.parseInt(tokenizer.nextToken());
            n = Integer.parseInt(tokenizer.nextToken());
            h = Integer.parseInt(tokenizer.nextToken());
            int[][][] boxes = new int[h][n][m];
            Queue<Point> tomatoPoints = new LinkedList<>();

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < n; j++) {
                    tokenizer = new StringTokenizer(reader.readLine(), " ");

                    for (int k = 0; k < m; k++) {
                        boxes[i][j][k] = Integer.parseInt(tokenizer.nextToken());

                        if (boxes[i][j][k] == 1) {
                            tomatoPoints.offer(new Point(i, j, k));
                        }
                    }
                }
            }

            System.out.println(solution(boxes, tomatoPoints));
        }
    }

    private static int solution(int[][][] boxes, Queue<Point> tomatoPoints) {
        int result = 0;
        bfs(boxes, tomatoPoints);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (boxes[i][j][k] == 0) {
                        return -1;
                    }

                    result = Math.max(result, boxes[i][j][k]);
                }
            }
        }

        return result - 1; // 익은 토마토 초기 값이 1이니까
    }

    private static void bfs(int[][][] boxes, Queue<Point> tomatoPoints) {
        while (!tomatoPoints.isEmpty()) {
            Point point = tomatoPoints.poll();

            for (int i = 0; i < 6; i++) {
                int newZ = point.z + dz[i];
                int newY = point.y + dy[i];
                int newX = point.x + dx[i];

                if (newZ < 0 || newY < 0 || newX < 0) {
                    continue;
                }

                if (h <= newZ || n <= newY || m <= newX) {
                    continue;
                }

                if (boxes[newZ][newY][newX] == 0) {
                    boxes[newZ][newY][newX] = boxes[point.z][point.y][point.x] + 1;
                    tomatoPoints.offer(new Point(newZ, newY, newX));
                }
            }
        }
    }

    static class Point {

        private int z;
        private int y;
        private int x;

        public Point(int z, int y, int x) {
            this.z = z;
            this.y = y;
            this.x = x;
        }
    }
}
