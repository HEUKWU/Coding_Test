class Solution {
    private String[] words;
    private boolean[] visited;
    private String target;
    private int count;

    public int solution(String begin, String target, String[] words) {
        this.words = words;
        visited = new boolean[words.length];
        this.target = target;
        dfs(begin, 0);

        return count;
    }

    private void dfs(String begin, int count) {
        if (begin.equals(target)) {
            this.count = count;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            String word = words[i];
            int c = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == word.charAt(j)) {
                    c++;
                }
            }

            if (c == begin.length() - 1) {
                visited[i] = true;
                dfs(words[i], count + 1);
                visited[i] = false;
            }
        }
    }
}