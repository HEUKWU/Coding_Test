import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final int INF = (int) 1e9;
    private static List<List<Node>> graph;
    private static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());

            graph = new ArrayList<>();
            for (int j = 0; j < n + 1; j++) {
                graph.add(new ArrayList<>());
            }

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());

                graph.get(b).add(new Node(a, time));
            }

            d = new int[n + 1];
            Arrays.fill(d, INF);

            dijkstra(start);

            int count = 0;
            int time = 0;
            for (int j = 1; j < n + 1; j++) {
                if (d[j] != INF) {
                    count++;
                    time = Math.max(time, d[j]);
                }
            }

            sb.append(count).append(' ').append(time).append('\n');
        }

        System.out.println(sb);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(start, 0));
        d[start] = 0;

        while (!q.isEmpty()) {
            Node node = q.poll();
            int a = node.getIndex();
            int time = node.getTime();

            if (d[a] < time) {
                continue;
            }

            for (Node n : graph.get(a)) {
                int nTime = d[a] + n.getTime();
                if (nTime < d[n.getIndex()]) {
                    d[n.getIndex()] = nTime;
                    q.offer(new Node(n.getIndex(), nTime));
                }
            }
        }
    }

    private static class Node implements Comparable<Node> {
        private final int index;
        private final int time;

        public int getIndex() {
            return index;
        }

        public int getTime() {
            return time;
        }

        public Node(int index, int time) {
            this.index = index;
            this.time = time;
        }

        @Override
        public int compareTo(Node o) {
            return this.time - o.time;
        }
    }
}
