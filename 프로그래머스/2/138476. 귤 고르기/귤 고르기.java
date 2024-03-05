import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
                continue;
            }
            map.put(i, 1);
        }

        ArrayList<Integer> values = new ArrayList<>(map.values());
        values.sort(Collections.reverseOrder());

        int count = 0;
        for (Integer value : values) {
            k -= value;
            count++;
            if (k <= 0) {
                return count;
            }
        }

        return 0;
    }
}