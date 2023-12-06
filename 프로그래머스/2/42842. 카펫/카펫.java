class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;

        for (int i = 2; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                int j = area / i;
                if ((j - 2) * (i - 2) == yellow) {
                    return new int[]{j, i};
                }
            }
        }

        return null;
    }
}