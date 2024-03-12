class Solution {
    static int[][] map;
    static int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        map = arr;
        quadTree(0, 0, arr.length);

        return answer;
    }

    void quadTree(int x, int y, int size) {
        if (press(x, y, size)) {
            answer[map[x][y]]++;

            return;
        }

        int newSize = size / 2;

        quadTree(x, y, newSize);
        quadTree(x + newSize, y, newSize);
        quadTree(x, y + newSize, newSize);
        quadTree(x + newSize, y + newSize, newSize);
    }

    boolean press(int x, int y, int size) {
        int value = map[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (value != map[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}