import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        Queue<Node> q = new LinkedList<>();

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        q.add(new Node(0, 0));

        int n = maps.length;
        int m = maps[0].length;

        while (!q.isEmpty()){
            Node node = q.poll();
            int x = node.x;
            int y = node.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (maps[nx][ny] == 1) {
                        q.add(new Node(nx, ny));
                        maps[nx][ny] = maps[x][y] + 1;
                    }
                }
            }
        }

        int answer = maps[n - 1][m - 1];

        return answer <= 1 ? -1 : answer;
    }

    static class Node {
        private final int x;
        private final int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}