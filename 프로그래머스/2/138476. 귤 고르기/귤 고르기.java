import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Integer[] values = new Integer[10000001];
        Arrays.fill(values, 0);
        for (int i : tangerine) {
            values[i]++;
        }

        Arrays.sort(values, Collections.reverseOrder());

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