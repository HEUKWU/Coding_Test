import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] todaySplit = today.split("\\.");
        int d1 = Integer.parseInt(todaySplit[0]) * 12 * 28
                + Integer.parseInt(todaySplit[1]) * 28 + Integer.parseInt(todaySplit[2]);

        Map<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String[] date = split[0].split("\\.");

            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]) + map.get(split[1]);
            int day = Integer.parseInt(date[2]);

            int d2 = (year * 12 * 28) + (month * 28) + day;

            if (d2 <= d1) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}