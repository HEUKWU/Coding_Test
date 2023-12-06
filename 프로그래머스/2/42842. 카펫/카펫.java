class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;

        int x = 0;
        int y = 0;
        for (int i = 2; i < area; i++) {
            if (area % i == 0) {
                int j = area / i;
                if (area - ((j - 2) * (i - 2)) == brown) {
                    x = Math.max(i, j);
                    y = Math.min(i, j);

                    break;
                }
            }
        }

        return new int[]{x, y};
    }
}