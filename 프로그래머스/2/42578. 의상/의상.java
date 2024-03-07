import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String kind = clothe[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        int sum = 1;
        for (Integer value : map.values()) {
            sum *= value + 1;
        }

        return sum - 1;
    }
}