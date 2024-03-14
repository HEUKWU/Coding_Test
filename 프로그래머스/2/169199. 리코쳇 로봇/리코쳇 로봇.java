import java.util.LinkedList;
import java.util.Queue;

class Solution {

    private final int[] dx = {0, 0, -1, 1};
    private final int[] dy = {1, -1, 0, 0};

    private static class Moving {
        private final int x;
        private final int y;
        private final int depth;

        public Moving(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }

    public int solution(String[] board) {
        Moving robot = null;
        Moving goal = null;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                char c = board[i].charAt(j);

                if (c == 'R') {
                    robot = new Moving(i, j, 0);
                } else if (c == 'G') {
                    goal = new Moving(i, j, 0);
                }
            }
        }

        return bfs(board, robot, goal);
    }

    private int bfs(String[] board, Moving robot, Moving goal) {
        Queue<Moving> q = new LinkedList<>();
        q.add(robot);

        boolean[][] visited = new boolean[board.length][board[0].length()];
        while (!q.isEmpty()) {
            Moving poll = q.poll();

            if (poll.x == goal.x && poll.y == goal.y) {
                return poll.depth;
            }

            for (int i = 0; i < 4; i++) {
                int nx = poll.x;
                int ny = poll.y;

                while (0 <= nx && nx < board.length && 0 <= ny && ny < board[0].length() && board[nx].charAt(ny) != 'D') {
                    nx += dx[i];
                    ny += dy[i];
                }

                nx -= dx[i];
                ny -= dy[i];

                if (visited[nx][ny] || (poll.x == nx && poll.y == ny)) {
                    continue;
                }

                visited[nx][ny] = true;
                q.add(new Moving(nx, ny, poll.depth + 1));
            }
        }

        return -1;
    }
}