import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i : ingredient) {
            stack.push(i);
            if (stack.peek() == 1) {
                stack.pop();
                if (!stack.isEmpty() && stack.peek() == 3) {
                    stack.pop();
                    if (!stack.isEmpty() && stack.peek() == 2) {
                        stack.pop();
                        if (!stack.isEmpty() && stack.peek() == 1) {
                            stack.pop();
                            count++;
                        } else {
                            stack.push(2);
                            stack.push(3);
                            stack.push(1);
                        }
                    } else {
                        stack.push(3);
                        stack.push(1);
                    }
                } else {
                    stack.push(1);
                }
            }
        }

        return count;
    }
}