import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] food_times, long k) {
        long summary = 0;
        for (int food_time : food_times) {
            summary += food_time;
        }
        if (summary <= k) {
            return -1;
        }

        PriorityQueue<Food> q = new PriorityQueue<>(Comparator.comparingInt(Food::getTime));
        for (int i = 0; i < food_times.length; i++) {
            q.offer(new Food(food_times[i], i + 1));
        }

        summary = 0;
        long previous = 0;
        long length = food_times.length;

        while (summary + ((q.peek().getTime() - previous) * length) <= k) {
            int now = q.poll().getTime();
            summary += (now - previous) * length;
            length -= 1;
            previous = now;
        }

        ArrayList<Food> list = new ArrayList<>();
        while (!q.isEmpty()) {
            list.add(q.poll());
        }

        list.sort(Comparator.comparingInt(Food::getIndex));

        return list.get((int) ((k - summary) % length)).getIndex();
    }

    class Food {

        private final int time;
        private final int index;

        public Food(int time, int index) {
            this.time = time;
            this.index = index;
        }

        public int getTime() {
            return time;
        }

        public int getIndex() {
            return index;
        }
    }
}