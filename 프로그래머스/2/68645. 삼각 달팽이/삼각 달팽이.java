import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[][] map = new int[n][n];

        int x = -1;
        int y = 0;
        int snail = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else {
                    x--;
                    y--;
                }

                map[x][y] = snail++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] m : map) {
            for (int i : m) {
                if (i != 0) {
                    list.add(i);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}