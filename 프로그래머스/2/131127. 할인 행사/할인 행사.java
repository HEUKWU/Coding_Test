import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (int k = 0; k < want.length; k++) {
                map.put(want[k], number[k]);
            }

            for (int j = i; j < 10 + i; j++) {
                String dis = discount[j];
                if (map.containsKey(dis)) {
                    map.put(dis, map.get(dis) - 1);
                    if (map.get(dis) == 0) {
                        map.remove(dis);
                    }
                }
            }

            if (map.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}