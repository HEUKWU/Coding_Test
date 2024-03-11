import java.util.ArrayList;

class Solution {
    ArrayList<String> list = new ArrayList<>();

    public int solution(String word) {

        recursion("", 0);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                count = i;
                break;
            }
        }

        return count;
    }

    void recursion(String s, int i) {
        char[] alphabet = {'A', 'E', 'I', 'O', 'U'};
        list.add(s);
        System.out.println(s);

        if (i == 5) {
            return;
        }

        for (int j = 0; j < 5; j++) {
            recursion(s + alphabet[j], i + 1);
        }
    }
}