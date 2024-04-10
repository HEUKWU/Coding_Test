import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
메모리: 14616 시간: 168
---------------------------------------
백트래킹
1부터 N까지 경로 다 더했을 때 최소 비용
출발 지점 정해서 모든 경로 계산
마지막에 되돌아오는 경로까지 계산했을 때의 최솟값
 */
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
        if (sum > answer) {
            return;
        }
        
        if (depth == n - 1) {
            // 다 더했을 때 되돌아오는 길이 존재하면 비용 최솟값으로 갱신
            int returnToStart = arr[now][start];
            if (returnToStart != 0) {
                answer = Math.min(answer, sum + returnToStart);
            }
        }

        for (int i = 0; i < n; i++) {
            // 아직 가지 않았고 길이 존재할 때
            if (!visited[i] && arr[now][i] != 0) {
                visited[i] = true;
                dfs(start, i, depth + 1, sum + arr[now][i]);
                visited[i] = false;
            }
        }
    }
}
