import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int n;
    private static int m;
    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(answer);
    }

    private static final int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    private static final int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

    private static int answer = 0;

    private static void bfs(int x, int y) {
        visited = new boolean[n][m];
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y, 0));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                int nd = node.distance + 1;

                if (0 <= nx && nx < n && 0 <= ny && ny < m && !visited[nx][ny]) {
                    if (map[nx][ny] == 1) {
                        answer = Math.max(answer, nd);
                        return;
                    }

                    q.offer(new Node(nx, ny, nd));
                    visited[nx][ny] = true;
                }
            }
        }
    }

    private static class Node {
        private final int x;
        private final int y;
        private final int distance;

        public Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
