class Solution {

    private static int count = 0;
    private static boolean[] visited;

    private void dfs(int x, int y, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {
                if (y >= dungeons[i][0]) {
                    visited[i] = true;
                    dfs(x + 1, y - dungeons[i][1], dungeons);
                    visited[i] = false;
                }
            }
        }

        count = Math.max(count, x);
    }

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        return count;
    }
}