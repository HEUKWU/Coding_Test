import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        int a = 2;
        int b = 1;
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            String prev = words[i - 1];

            if (word.charAt(0) != prev.charAt(prev.length() - 1)) {
                return new int[]{a, b};
            }
            if (list.contains(word)) {
                return new int[]{a, b};
            }
            
            list.add(word);

            a++;
            if (a == n + 1) {
                a = 1;
                b++;
            }

        }

        return new int[]{0, 0};
    }
}