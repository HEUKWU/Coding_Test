import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    static class Coordinate {
        private final long x;
        private final long y;

        public Coordinate(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    public String[] solution(int[][] line) {
        List<Coordinate> list = new ArrayList<>();

        for (int i = 0; i < line.length - 1; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];
            for (int j = i + 1; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                if (a * d != b * c) {
                    double x = (double) (b * f - e * d) / (a * d - b * c);
                    double y = (double) (e * c - a * f) / (a * d - b * c);
                    if (x % 1 == 0 && y % 1 == 0) {
                        list.add(new Coordinate((long) x, (long) y));
                    }
                }
            }
        }

        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;
        for (Coordinate coordinate : list) {
            long nx = coordinate.x;
            long ny = coordinate.y;

            minX = Math.min(minX, nx);
            minY = Math.min(minY, ny);

            maxX = Math.max(maxX, nx);
            maxY = Math.max(maxY, ny);
        }

        int width = (int) (maxX - minX + 1);
        int height = (int) (maxY - minY + 1);

        char[][] board = new char[height][width];
        for (char[] b : board) {
            Arrays.fill(b, '.');
        }

        for (Coordinate coordinate : list) {
            board[(int) (maxY - coordinate.y)][(int) (coordinate.x - minX)] = '*';
        }

        String[] answer = new String[height];
        for (int i = 0; i < height; i++) {
            answer[i] = new String(board[i]);
        }

        return answer;
    }
}