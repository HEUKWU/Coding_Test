import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
        static class Mineral {
        private final int diamond;
        private final int iron;
        private final int stone;

        public Mineral(int diamond, int iron, int stone) {
            this.diamond = diamond;
            this.iron = iron;
            this.stone = stone;
        }
    }

    private final int[][] board = {
            {1, 1, 1},
            {5, 1, 1},
            {25, 5, 1}
    };

    public int solution(int[] picks, String[] minerals) {
        List<Mineral> list = new ArrayList<>();
        int sum = Arrays.stream(picks).sum();
        for (int i = 0; i < minerals.length; i += 5) {
            if (sum == 0) {
                break;
            }

            int diamond = 0;
            int iron = 0;
            int stone = 0;

            for (int j = i; j < i + 5; j++) {
                if (j == minerals.length) {
                    break;
                }

                String mineral = minerals[j];
                int score = mineral.equals("diamond") ? 0 : mineral.equals("iron") ? 1 : 2;

                diamond += board[0][score];
                iron += board[1][score];
                stone += board[2][score];
            }

            list.add(new Mineral(diamond, iron, stone));
            sum--;
        }

        int count = 0;
        list.sort((a, b) -> b.stone - a.stone);
        for (Mineral mineral : list) {
            int diamond = mineral.diamond;
            int iron = mineral.iron;
            int stone = mineral.stone;

            if (picks[0] > 0) {
                count += diamond;
                picks[0]--;
            } else if (picks[1] > 0) {
                count += iron;
                picks[1]--;
            } else if (picks[2] > 0){
                count += stone;
                picks[2]--;
            }
        }

        return count;
    }
}