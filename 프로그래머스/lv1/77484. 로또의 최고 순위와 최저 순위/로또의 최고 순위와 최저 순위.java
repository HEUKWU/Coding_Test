class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] a = {-1, 6, 5, 4, 3, 2, 1};
        int count = 0;
        int zCount = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zCount++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }

        int[] scores = {6, 6};
        
        for (int i = 0; i < a.length; i++) {
            if (zCount + count == a[i]) {
                scores[0] = i;
            }
            if (count == a[i]) {
                scores[1] = i;
            }
        }

        return scores;
    }
}