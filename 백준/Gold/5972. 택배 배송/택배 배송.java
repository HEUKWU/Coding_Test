import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final int INF = (int) 1e9;
    private static final List<List<Node>> graph = new ArrayList<>();
    private static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        d = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        Arrays.fill(d, INF);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Node(index, cost));
            graph.get(index).add(new Node(start, cost));
        }

        dijkstra();

        System.out.println(d[n]);
    }

    private static void dijkstra() {
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(1, 0));
        d[1] = 0;

        while (!q.isEmpty()) {
            Node node = q.poll();
            int index = node.getIndex();
            int cost = node.getCost();

            if (d[index] < cost) {
                continue;
            }

            for (Node n : graph.get(index)) {
                int nCost = d[index] + n.getCost();
                if (nCost < d[n.getIndex()]) {
                    d[n.getIndex()] = nCost;
                    q.offer(new Node(n.getIndex(), nCost));
                }
            }
        }
    }

    private static class Node implements Comparable<Node> {
        private final int index;
        private final int cost;

        public int getIndex() {
            return index;
        }

        public int getCost() {
            return cost;
        }

        public Node(int index, int cost) {
            this.index = index;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
