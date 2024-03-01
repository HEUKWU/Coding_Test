import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (list.contains(word)) {
                return new int[]{(i % n + 1), (i / n + 1)};
            }

            String prev = words[i - 1];
            if (prev.charAt(prev.length() - 1) != word.charAt(0)) {
                return new int[]{(i % n + 1), (i / n + 1)};

            }

            list.add(word);
        }

        return new int[]{0, 0};
    }
}