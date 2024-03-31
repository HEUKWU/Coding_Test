import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] room = new char[n][n];
        for (int i = 0; i < n; i++) {
            room[i] = br.readLine().toCharArray();
        }

        // 가로로 누울 수 있는 자리의 개수
        int horizontal = 0;
        // 세로로 누울 수 있는 자리의 개수
        int vertical = 0;
        for (int i = 0; i < n; i++) {
            // 가로로 비어있는 칸의 개수
            int hSpace = 0;
            // 세로로 비어있는 칸의 개수
            int vSpace = 0;
            for (int j = 0; j < n; j++) {
                // 가로 확인
                if (room[i][j] == '.') {
                    hSpace++;
                }
                // 짐이나 벽에 닿았을 때
                if (room[i][j] == 'X' || j == n - 1) {
                    if (hSpace >= 2) {
                        horizontal++;
                    }
                    hSpace = 0;
                }

                // 세로 확인
                if (room[j][i] == '.') {
                    vSpace++;
                }

                if (room[j][i] == 'X' || j == n - 1) {
                    if (vSpace >= 2) {
                        vertical++;
                    }
                    vSpace = 0;
                }
            }
        }

        System.out.println(horizontal + " " + vertical);
    }
}