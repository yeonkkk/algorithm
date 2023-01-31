import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * BOJ 1063. 킹
 */

public class Main {
    private static int kingPointX;
    private static int kingPointY;
    private static int stonePointX;
    private static int stonePointY;
    public static Map<String, int[]> direction = Map.of(
            "R", new int[]{1, 0},
            "L", new int[]{-1, 0},
            "B", new int[]{0, -1},
            "T", new int[]{0, 1},
            "RT", new int[]{1, 1},
            "LT", new int[]{-1, 1},
            "RB", new int[]{1, -1},
            "LB", new int[]{-1, -1});

    public static void main(String[] args) throws IOException {
        // 킹 위치, 돌 위치, 이동 횟수 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String kingPoint = st.nextToken();
        kingPointX = kingPoint.charAt(0) - 'A' + 1;
        kingPointY = Character.getNumericValue(kingPoint.charAt(1));

        String stonePoint = st.nextToken();
        stonePointX = stonePoint.charAt(0) - 'A' + 1;
        stonePointY = Character.getNumericValue(stonePoint.charAt(1));

        int n = Integer.parseInt(st.nextToken());

        // 이동 방향 입력 받기
        for (int i = 0; i < n; i++) {
            int[] curDirection = direction.get(br.readLine());
            move(curDirection);
        }

        System.out.printf("%c%d%n", kingPointX + 64, kingPointY);
        System.out.printf("%c%d", stonePointX + 64, stonePointY);
    }

    private static void move(int[] curDirection) {
        // 체스 판에서 벗어나지 않는지 확인
        if (validator(kingPointX, kingPointY, curDirection)) {
            // 킹 이동
            kingPointX += curDirection[0];
            kingPointY += curDirection[1];

            // 둘이 같은 위치에 놓이면 돌 이동
            checkDuplication(curDirection);
        }
    }

    private static boolean validator(int pointX, int pointY, int[] curDirection) {
        int newPointX = pointX + curDirection[0];
        int newPointY = pointY + curDirection[1];

        if (newPointX < 1 || newPointX > 8 || newPointY < 1 || newPointY > 8) {
            return false;
        }

        return true;
    }

    private static void checkDuplication(int[] curDirection) {
        if (kingPointX == stonePointX && kingPointY == stonePointY) {
            if (validator(stonePointX, stonePointY, curDirection)) {
                stonePointX += curDirection[0];
                stonePointY += curDirection[1];
            } else {
                kingPointX -= curDirection[0];
                kingPointY -= curDirection[1];
            }
        }
    }
}
