import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int n;
    private static int[][] arr;
    private static boolean[] visited;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            visited[i] = true;
            dfs(i, i, 0, 0);
        }

        System.out.println(answer);
    }

    private static void dfs(int start, int now, int depth, int sum) {
        if (depth == n - 1) {
            int returnToStart = arr[now][start];
            if (returnToStart != 0) {
                answer = Math.min(answer, sum + returnToStart);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && arr[now][i] != 0) {
                visited[i] = true;
                dfs(start, i, depth + 1, sum + arr[now][i]);
                visited[i] = false;
            }
        }
    }
}
