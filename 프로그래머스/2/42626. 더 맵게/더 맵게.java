import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int count = 0;
        for (int i : scoville) {
            q.offer(i);
        }

        while (q.peek() < K) {
            if (q.size() == 1) {
                return -1;
            }

            q.add(q.poll() + q.poll() * 2);
            count++;
        }

        return count;
    }
}