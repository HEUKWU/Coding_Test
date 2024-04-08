import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n;
    private static char[][] board;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        visited = new boolean[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j)) {
                    count++;
                }
                if (board[i][j] == 'R') {
                    board[i][j] = 'G';
                }
            }
        }

        visited = new boolean[n][n];
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j)) {
                    count2++;
                }
            }
        }

        System.out.println(count + " " + count2);
    }

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, -1, 0, 1};

    private static boolean dfs(int x, int y) {
        if (visited[x][y]) {
            return false;
        }

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (board[nx][ny] != board[x][y]) {
                    continue;
                }

                dfs(nx, ny);
            }
        }

        return true;
    }
}
