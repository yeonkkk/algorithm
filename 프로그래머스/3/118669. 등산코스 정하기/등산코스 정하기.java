import java.util.*;


class Solution {
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
       ArrayList<ArrayList<Node>> graph = createGraph(n, paths);
        HashMap<Integer, Boolean> summitMap = createSummitMap(summits);
        HashMap<Integer, Boolean> gateMap = createGateMap(summits);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Arrays.sort(summits);

        int[] intensities = new int[n + 1];
        Arrays.fill(intensities, Integer.MAX_VALUE);

        for (int gate : gates) {
            pq.offer(new Node(gate, 0));
            intensities[gate] = 0;
        }

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (gateMap.containsKey(now.index) || summitMap.containsKey(now.index)) {
                continue;
            }

            if (intensities[now.index] < now.intensity) {
                continue;
            }

            for (Node next : graph.get(now.index)) {
                int intensity =
                        (next.intensity == Integer.MAX_VALUE) ? now.intensity : Math.max(next.intensity, now.intensity);
                if (intensities[next.index] > intensity) {
                    intensities[next.index] = intensity;
                    pq.offer(new Node(next.index, intensity));
                }
            }
        }

        int index = -1;
        int minIntensity = Integer.MAX_VALUE;
        for (int summit : summits) {
            if (intensities[summit] < minIntensity) {
                minIntensity = intensities[summit];
                index = summit;
            }
        }
        return new int[]{index, minIntensity};
    }

    private static HashMap<Integer, Boolean> createGateMap(int[] gates) {
        HashMap<Integer, Boolean> gateMap = new HashMap<>();
        for (int gate : gates) {
            gateMap.put(gate, true);
        }
        return gateMap;
    }

    private static HashMap<Integer, Boolean> createSummitMap(int[] summits) {
        HashMap<Integer, Boolean> summitMap = new HashMap<>();
        for (int summit : summits) {
            summitMap.put(summit, true);
        }
        return summitMap;
    }

    private ArrayList<ArrayList<Node>> createGraph(int n, int[][] paths) {
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] p : paths) {
            graph.get(p[0]).add(new Node(p[1], p[2]));
            graph.get(p[1]).add(new Node(p[0], p[2]));
        }

        return graph;
    }
    
    class Node implements Comparable<Node> {
    int index;
    int intensity;

    public Node(int index, int intensity) {
        this.index = index;
        this.intensity = intensity;
    }

    @Override
    public int compareTo(Node o) {
        return this.intensity - o.intensity;
    }
}
}