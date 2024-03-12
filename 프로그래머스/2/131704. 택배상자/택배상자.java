import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> sub = new Stack<>();

        int count = 0;
        for (int i = 0, j = 0; i < order.length; i++) {
            sub.add(i + 1);

            while (!sub.isEmpty()) {
                if (sub.peek() == order[j]) {
                    sub.pop();
                    j++;
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}