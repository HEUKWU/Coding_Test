package programmers.Lv_0.안전지대;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(solution(a));

        int[][] b = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(solution(b));

        int[][] c = {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };
        System.out.println(solution(c));
    }

    static int solution(int[][] board) {
        int[][] a = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    method(i, j, a);
                }
            }
        }

        int count = 0;
        for (int[] i : a) {
            for (int j : i) {
                if (j == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    static void method(int i, int j, int[][] a) {
        int x;
        int y;
        int[] xs = {0, -1, -1, -1, 0, 1, 1, 1, 0};
        int[] ys = {0, -1, 0, 1, 1, 1, 0, -1, -1};
        for (int k = 0; k < 9; k++) {
            x = i + xs[k];
            y = j + ys[k];
            if (x < a.length && y < a.length) {
                if (x >= 0 && y >= 0) {
                    a[x][y] = 1;
                }
            }
        }
    }
}
