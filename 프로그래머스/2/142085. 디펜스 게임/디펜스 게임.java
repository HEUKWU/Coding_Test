import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int count = enemy.length;
        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            q.add(enemy[i]);

            if (n < 0) {
                if (k > 0 && !q.isEmpty()) {
                    n += q.poll();
                    k--;
                } else {
                    count = i;
                    break;
                }
            }
        }

        return count;
    }
}