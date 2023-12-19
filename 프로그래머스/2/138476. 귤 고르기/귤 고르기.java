import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            k -= list.get(i);
            count++;
            if (k <= 0) {
                break;
            }
        }

        return count;
    }
}