class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        String s = board[h][w];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nx = h + dx[i];
            int ny = w + dy[i];

            if (0 <= nx && nx < board.length && 0 <= ny && ny < board.length) {
                if (board[nx][ny].equals(s)) {
                    count++;
                }
            }
        }

        return count;
    }
}