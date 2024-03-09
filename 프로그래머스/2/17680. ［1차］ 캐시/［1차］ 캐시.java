import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int time = 0;
        Queue<String> cache = new LinkedList<>();
        for (String city : cities) {
            String data = city.toLowerCase();
            if (cache.remove(data)) {
                time += 1;
                cache.add(data);
            } else {
                time += 5;
                if (cache.size() >= cacheSize) {
                    cache.poll();
                }
                cache.add(data);
            }
        }

        return time;
    }
}