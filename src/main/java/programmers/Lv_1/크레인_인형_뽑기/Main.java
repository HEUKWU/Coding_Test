package programmers.Lv_1.크레인_인형_뽑기;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] b = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(a, b));
    }

    static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                int a = board[j][(i - 1)];
                if (a != 0) {
                    board[j][(i - 1)] = 0;
                    if (stack.empty() || stack.peek() != a) {
                        stack.push(a);
                    } else {
                        stack.pop();
                        count++;
                    }
                    break;
                }
            }
        }

        return count * 2;
    }
}
