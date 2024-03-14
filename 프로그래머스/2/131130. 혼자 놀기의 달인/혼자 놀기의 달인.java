import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    
    private int[] box;
    private boolean[] visit;
    private int depth;

    public int solution(int[] cards) {
        box = cards;
        visit = new boolean[cards.length + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < cards.length; i++) {
            if (!visit[i + 1]) {
                depth = 1;
                visit[i + 1] = true;
                open(cards[i]);
                list.add(depth);
            }
        }

        if (list.size() < 2) {
            return 0;
        }
        list.sort(Comparator.reverseOrder());
        
        return list.get(0) * list.get(1);
    }

    private void open(int x) {
        if (!visit[x]) {
            visit[x] = true;
            depth++;
            open(box[x - 1]);
        }
    }
}