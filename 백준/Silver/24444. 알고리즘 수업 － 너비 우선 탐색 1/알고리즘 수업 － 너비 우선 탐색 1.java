import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }

        int[] visited = new int[n + 1];

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list.get(u).add(v);
            list.get(v).add(u);
        }

        for (int i = 1; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }

        Queue<List<Integer>> q = new LinkedList<>();
        q.add(list.get(r));

        int count = 1;
        visited[r] = count++;
        while (!q.isEmpty()) {
            List<Integer> nextNodes = q.poll();

            for (Integer nextNode : nextNodes) {
                if (visited[nextNode] == 0) {
                    q.add(list.get(nextNode));
                    visited[nextNode] = count++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append('\n');
        }

        System.out.println(sb);
    }
}
