import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String[] board = new String[row];

        for (int i = 0; i < row; i++) {
            board[i] = br.readLine();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                min = Math.min(min, method(i, j, board));
            }
        }

        System.out.println(min);
    }

    private static int method(int i, int j, String[] board) {
        String[] org = {"WBWBWBWB", "BWBWBWBW"};
        int count = 0;

        for (int k = 0; k < 8; k++) {
            int a = i + k;
            for (int l = 0; l < 8; l++) {
                int b = j + l;
                if (board[a].charAt(b) != org[k % 2].charAt(l)) {
                    count++;
                }
            }
        }

        return Math.min(count, 64 - count);
    }
}