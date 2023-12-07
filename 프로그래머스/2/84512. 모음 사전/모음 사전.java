import java.util.ArrayList;
import java.util.List;

class Solution {

    private final static char[] alphabet = {'A', 'E', 'I', 'O', 'U'};
    private final static List<String> list = new ArrayList<>();

    private static void recursion(String word, String s, int x) {
        list.add(s);

        if (x == 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            recursion(word, s + alphabet[i], x + 1);
        }
    }

    public int solution(String word) {
        int count = 0;

        recursion(word, "", 0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                count = i;
            }
        }

        return count;
    }
}