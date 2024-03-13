class Solution {
    public long solution(int k, int d) {
        long count = 0;
        for (int i = 0; i <= d; i += k) {
            count += (long) Math.sqrt(Math.pow(d, 2) - Math.pow(i, 2)) / k + 1;
        }

        return count;
    }
}