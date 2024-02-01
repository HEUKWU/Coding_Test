import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i : moves) {
            int index = i - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][index] != 0) {
                    if (!stack.isEmpty()) {
                        if (stack.peek() == board[j][index]) {
                            stack.pop();
                            count += 2;
                            board[j][index] = 0;
                            break;
                        }
                    }
                    stack.push(board[j][index]);
                    board[j][index] = 0;
                    break;
                }
            }
        }

        return count;
    }
}