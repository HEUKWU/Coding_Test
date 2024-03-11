import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        HashSet<Integer> a = new HashSet<>();
        HashMap<Integer, Integer> b = new HashMap<>();

        a.add(topping[0]);
        for (int i = 1;i < topping.length; i++) {
            b.put(topping[i], b.getOrDefault(topping[i], 0) + 1);
        }

        int count = 0;
        for (int i = 1;i < topping.length; i++) {
            a.add(topping[i]);
            b.put(topping[i], b.get(topping[i]) - 1);
            if (b.get(topping[i]) == 0) {
                b.remove(topping[i]);
            }
            if (a.size() == b.size()) {
                count++;
            }

        }

        return count;
    }
}