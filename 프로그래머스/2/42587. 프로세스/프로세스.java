import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static class Process {
        private final int index;
        private final int priorities;

        public Process(int index, int priorities) {
            this.index = index;
            this.priorities = priorities;
        }

        public int getIndex() {
            return index;
        }

        public int getPriorities() {
            return priorities;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        ArrayList<Process> list = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(i, priorities[i]));
        }

        while (!queue.isEmpty()) {
            Process poll = queue.poll();
            int first = poll.getPriorities();

            boolean b = true;
            for (Process process : queue) {
                if (process.getPriorities() > first) {
                    queue.add(poll);
                    b = false;
                    break;
                }
            }

            if (b) {
                list.add(poll);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIndex() == location) {
                return i + 1;
            }
        }

        return 0;
    }
}