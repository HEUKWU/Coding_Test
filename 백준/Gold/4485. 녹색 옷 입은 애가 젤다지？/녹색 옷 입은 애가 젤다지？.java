import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    private static final int INF = (int) 1e9;
    private static int n;
    private static int[][] cave;
    private static int[][] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int time = 1;
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            }

            n = Integer.parseInt(s);

            cave = new int[n][n];
            d = new int[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    cave[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append("Problem ").append(time++).append(": ").append(dijkstra()).append('\n');
        }

        System.out.println(sb);
    }

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static int dijkstra() {
        PriorityQueue<Node> q = new PriorityQueue<>();
        for (int[] i : d) {
            Arrays.fill(i, INF);
        }

        q.offer(new Node(0, 0, cave[0][0]));
        d[0][0] = cave[0][0];

        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.x;
            int y = node.y;
            int cost = node.cost;

            if (x == n - 1 && y == n - 1) {
                return cost;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    int nCost = cost + cave[nx][ny];
                    if (nCost < d[nx][ny]) {
                        d[nx][ny] = nCost;
                        q.offer(new Node(nx, ny, nCost));
                    }
                }
            }
        }
        return -1;
    }

    private static class Node implements Comparable<Node> {
        private final int x;
        private final int y;
        private final int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
