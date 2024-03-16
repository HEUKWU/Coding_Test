import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    boolean[] visited;

    public int solution(int n, int[][] edge) {
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] i : edge) {
            int a = i[0];
            int b = i[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        visited = new boolean[n + 1];

        int count = 0;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{1, 0});
        visited[1] = true;
        int max = 0;

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int a = arr[0];
            int b = arr[1];

            if (max == b) {
                count++;
            } else if (max < b) {
                max = b;
                count = 1;
            }

            for (int i = 0; i < graph.get(a).size(); i++) {
                int j = graph.get(a).get(i);
                if (!visited[j]) {
                    q.add(new int[]{j, b + 1});
                    visited[j] = true;
                }
            }

        }

        return count;
    }
}