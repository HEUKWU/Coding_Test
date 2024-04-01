import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] num = br.readLine().split(" ");
            arr[i] = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
        }

        // 회전 하는 그룹 개수
        int rotateGroupCount = Math.min(n, m) / 2;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < rotateGroupCount; j++) {
                int x = j;
                int y = j;
                int temp = arr[x][y];

                int index = 0;
                while (index < 4) {
                    int nx = x + dx[index];
                    int ny = y + dy[index];

                    if (nx < n - j && ny < m - j && nx >= j && ny >= j) {
                        arr[x][y] = arr[nx][ny];
                        x = nx;
                        y = ny;
                    } else {
                        index++;
                    }
                }

                arr[j + 1][j] = temp;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}