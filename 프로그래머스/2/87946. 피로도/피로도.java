class Solution {

    private int[][] dungeons;
    private boolean[] visited;
    private int count = 0;

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];

        dfs(0, k);

        return count;
    }

    private void dfs(int depth, int k) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1]);
                visited[i] = false;
            }
        }

        count = Math.max(count, depth);
    }
}