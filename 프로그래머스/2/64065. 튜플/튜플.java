import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String s) {
        String[] split = s.replaceAll("[{}]", " ").trim().split(", ");
        int[] answer = new int[split.length];
        Set<Integer> set = new HashSet<>();

        Arrays.sort(split, Comparator.comparingInt(String::length));
        int i = 0;
        for (String a : split) {
            for (String b : a.split(",")) {
                int c = Integer.parseInt(b.trim());
                if (!set.contains(c)) {
                    set.add(c);
                    answer[i++] = c;
                }
            }
        }

        return answer;
    }
}