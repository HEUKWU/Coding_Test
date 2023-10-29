import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] aScore = {1, 2, 3, 4, 5};
        int[] bScore = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cScore = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == aScore[i % aScore.length]) {
                scores[0]++;
            }
            if (answers[i] == bScore[i % bScore.length]) {
                scores[1]++;
            }
            if (answers[i] == cScore[i % cScore.length]) {
                scores[2]++;
            }
        }

        int max = Math.max(scores[0], scores[1]);
        max = Math.max(max, scores[2]);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}