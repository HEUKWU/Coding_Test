import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String s = clothe[1];
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while (it.hasNext()) {
            answer *= it.next() + 1;
        }

        return answer - 1;
    }
}