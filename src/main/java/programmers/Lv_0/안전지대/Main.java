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
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    method(i, j, board);
                }
            }
        }

        int count = 0;
        for (int[] i : board) {
            for (int a : i) {
                if (a == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    static void method(int i, int j, int[][] board) {
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int x = k + i;
                int y = l + j;

                if (0 <= x && x < board.length && 0 <= y && y < board.length) {
                    if (board[x][y] == 0) {
                        board[x][y] = 2;
                    }
                }
            }
        }
    }
}
