class Solution {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;

        for (int[] i : sizes) {
            x = Math.max(x, Math.max(i[0], i[1]));
            y = Math.max(y, Math.min(i[0], i[1]));
        }

        return x * y;
    }
}