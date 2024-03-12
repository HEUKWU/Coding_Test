import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int n = order.length;

        int count = 0;

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        Stack<Integer> stack = new Stack<>();
        int added = 0;
        for (int box : order) {

            while (true) {
                if (box < added) {
                    if (stack.peek() == box) {
                        added = stack.pop();
                        count++;
                        break;
                    } else {
                        return count;
                    }
                } else {
                    if (!q.isEmpty() && q.peek() == box) {
                        added = q.poll();
                        count++;
                        break;
                    } else {
                        stack.push(q.poll());
                    }
                }
            }
        }
        
        return count;
    }
}