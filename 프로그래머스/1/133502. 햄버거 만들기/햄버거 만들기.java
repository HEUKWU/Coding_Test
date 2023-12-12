import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for (int i : ingredient) {
            stack.add(i);

            if (i == 1 && stack.size() >= 4) {
                if (stack.peek() == 1) {
                    stack.pop();
                    if (stack.peek() == 3) {
                        stack.pop();
                        if (stack.peek() == 2) {
                            stack.pop();
                            if (stack.peek() == 1) {
                                stack.pop();
                                count++;
                            } else {
                                stack.add(2);
                                stack.add(3);
                                stack.add(1);
                            }
                        } else {
                            stack.add(3);
                            stack.add(1);
                        }
                    } else {
                        stack.add(1);
                    }
                }
            }
        }

        return count;
    }
}