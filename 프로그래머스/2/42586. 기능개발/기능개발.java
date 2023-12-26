import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }

        int first = queue.poll();
        int count = 1;

        while (!queue.isEmpty()) {
            if (first < queue.peek()) {
                list.add(count);
                count = 1;
                first = queue.poll();
            } else {
                count++;
                queue.poll();
            }
        }
        list.add(count);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}