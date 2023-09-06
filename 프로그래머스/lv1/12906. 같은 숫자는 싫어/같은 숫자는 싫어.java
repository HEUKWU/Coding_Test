import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.empty() || stack.peek() != i) {
                stack.add(i);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}