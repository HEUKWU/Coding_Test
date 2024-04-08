import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static List<List<Integer>> list = new ArrayList<>();
    private static int[] visited;
    private static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }

        visited = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list.get(u).add(v);
            list.get(v).add(u);
        }

        for (int i = 1; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }

        dfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append('\n');
        }

        System.out.println(sb);
    }

    private static void dfs(int r) {
        visited[r] = count++;

        List<Integer> nextNodes = list.get(r);

        for (Integer nextNode : nextNodes) {
            if (visited[nextNode] == 0) {
                dfs(nextNode);
            }
        }
    }
}
