import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            String[] time = split[0].split(":");

            String car = split[1];
            int minutes = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

            if (split[2].equals("IN")) {
                map.put(car, minutes);
            } else {
                map2.put(car, map2.getOrDefault(car, 0) + minutes - map.get(car));
                map.remove(car);
            }
        }

        if (!map.isEmpty()) {
            for (String car : map.keySet()) {
                map2.put(car, map2.getOrDefault(car, 0) + (1439 - map.getOrDefault(car, 0)));
            }
        }

        for (String car : map2.keySet()) {
            Integer total = map2.get(car);

            if (total <= fees[0]) {
                map.put(car, fees[1]);
            } else {
                map.put(car, fees[1] + (int) Math.ceil((total - fees[0]) / (double) fees[2]) * fees[3]);
            }
        }

        ArrayList<String> cars = new ArrayList<>(map.keySet());
        Collections.sort(cars);

        int[] answer = new int[cars.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(cars.get(i));
        }

        return answer;
    }
}