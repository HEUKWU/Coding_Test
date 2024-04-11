import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int n;
    private static int[][] map;
    private static final Queue<Cloud> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        q.offer(new Cloud(n - 1, 0));
        q.offer(new Cloud(n - 1, 1));
        q.offer(new Cloud(n - 2, 0));
        q.offer(new Cloud(n - 2, 1));

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            skill(d - 1, s);
        }

        int sum = 0;
        for (int[] i : map) {
            for (int j : i) {
                sum += j;
            }
        }

        System.out.println(sum);
    }

    private static final int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    private static final int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    private static void skill(int d, int s) {

        for (int i = 0; i < q.size(); i++) {
            Cloud cloud = q.poll();
            int nx = (n + cloud.x + dx[d] * (s % n)) % n;
            int ny = (n + cloud.y + dy[d] * (s % n)) % n;

            q.offer(new Cloud(nx, ny));
            map[nx][ny]++;
        }

        boolean[][] visited = new boolean[n][n];
        
        while (!q.isEmpty()) {
            Cloud cloud = q.poll();
            int x = cloud.x;
            int y = cloud.y;

            visited[x][y] = true;

            int count = 0;
            for (int i = 1; i <= 7; i += 2) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (map[nx][ny] != 0) {
                        count++;
                    }
                }
            }
            map[x][y] += count;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && map[i][j] >= 2) {
                    map[i][j] -= 2;
                    q.offer(new Cloud(i, j));
                }
            }
        }
    }

    private static class Cloud {
        private final int x;
        private final int y;

        public Cloud(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
