class Solution {
    public int[] solution(int n, long left, long right) {
        int[] result = new int[(int) (right - left + 1)];

        int j = 0;
        for (long i = left; i <= right; i++) {
            result[j++] = (int) Math.max(i / n, i % n) + 1;
        }

        return result;
    }
}