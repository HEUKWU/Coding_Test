import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];

            char first = s.charAt(0);
            char second = s.charAt(1);

            if (choice < 4) {
                map.put(first, map.get(first) + (4 - choice));
            } else if (choice > 4) {
                map.put(second, map.get(second) + (choice - 4));
            }
        }

        String[] c = {"RT", "CF", "JM", "AN"};
        StringBuilder sb = new StringBuilder();
        
        for (String s : c) {
            Integer first = map.get(s.charAt(0));
            Integer second = map.get(s.charAt(1));
            if (first > second || first.equals(second)) {
                sb.append(s.charAt(0));
            } else {
                sb.append(s.charAt(1));
            }
        }

        return sb.toString();
    }
}