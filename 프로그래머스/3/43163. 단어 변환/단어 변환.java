import java.util.LinkedList;
import java.util.Queue;

class Solution {

    static class Node {
        private final String word;
        private final int count;

        public Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

    public int solution(String begin, String target, String[] words) {
        int length = words.length;
        boolean[] visited = new boolean[length];

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(begin, 0));

        int answer = 0;
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.word.equals(target)) {
                answer = node.count;
                break;
            }

            for (int i = 0; i < length; i++) {
                if (!visited[i] && check(node.word, words[i])) {
                    visited[i] = true;
                    q.add(new Node(words[i], node.count + 1));
                }
            }
        }

        return answer;
    }

    private boolean check(String word, String next) {
        int c = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != next.charAt(i)) {
                c++;
            }
            if (c > 1) {
                return false;
            }
        }

        return true;
    }
}