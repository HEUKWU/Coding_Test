import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int starty = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int targetX = Integer.parseInt(st.nextToken());
            int targety = Integer.parseInt(st.nextToken());

            sb.append(bfs(n, startX, starty, targetX, targety)).append('\n');
        }

        System.out.println(sb);
    }

    private static final int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static final int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

    private static int bfs(int n, int startX, int startY, int targetX, int targetY) {
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(startX, startY));

        int[][] board = new int[n][n];
        board[startX][startY] = 1;

        while (!q.isEmpty()) {
            Coordinate coordinate = q.poll();
            int x = coordinate.x;
            int y = coordinate.y;

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (board[nx][ny] == 0) {
                        q.add(new Coordinate(nx, ny));
                        board[nx][ny] = board[x][y] + 1;
                    }
                }
            }
        }

        return board[targetX][targetY] - 1;
    }

    static class Coordinate {
        private final int x;
        private final int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
