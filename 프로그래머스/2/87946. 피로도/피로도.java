import static java.lang.Math.max;

class Solution {
    
    
    private int result = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        check(dungeons, visited, k, 0);
        return result;
    }

    private void check(int[][] dungeons, boolean[] visited, int k, int depth) {
        for (int i = 0; i < dungeons.length; i++) {
            int threshold = dungeons[i][0];
            int cost = dungeons[i][1];

            if (!visited[i] && threshold <= k) {
                visited[i] = true;
                check(dungeons, visited, k - cost, depth + 1);
                visited[i] = false;
            }
        }

        result = max(result, depth);
    }
}