import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    private static final int n = 12;
    private static final int m = 6;
    private static char[][] field;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        field = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                field[i][j] = s.charAt(j);
            }
        }

        int count = 0;
        while (true) {
            boolean isChain = false;
            visited = new boolean[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (field[i][j] != '.') {
                        List<Puyo> puyos = bfs(field[i][j], i, j);

                        if (puyos.size() >= 4) {
                            isChain = true;
                            for (int k = 0; k < puyos.size(); k++) {
                                field[puyos.get(k).x][puyos.get(k).y] = '.';
                            }
                        }
                    }
                }
            }

            if (!isChain) {
                break;
            }

            fall();
            count++;
        }

        System.out.println(count);
    }

    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};

    private static List<Puyo> bfs(char c, int x, int y) {
        Queue<Puyo> q = new LinkedList<>();
        q.offer(new Puyo(x, y));
        visited[x][y] = true;

        List<Puyo> list = new ArrayList<>();
        list.add(new Puyo(x, y));

        while (!q.isEmpty()) {
            Puyo puyo = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = puyo.x + dx[i];
                int ny = puyo.y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (!visited[nx][ny] && field[nx][ny] == c) {
                        visited[nx][ny] = true;
                        q.offer(new Puyo(nx, ny));
                        list.add(new Puyo(nx, ny));
                    }
                }
            }
        }

        return list;
    }

    private static void fall() {
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (field[j][i] == '.') {
                    for (int k = j - 1; k >= 0; k--) {
                        if (field[k][i] != '.') {
                            field[j][i] = field[k][i];
                            field[k][i] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

    static class Puyo {
        private final int x;
        private final int y;

        public Puyo(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
