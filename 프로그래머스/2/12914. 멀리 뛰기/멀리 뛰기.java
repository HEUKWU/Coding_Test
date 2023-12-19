class Solution {
    public long solution(int n) {
        long[] a = new long[2001];
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i < 2001; i++) {
            a[i] = (a[i - 2] + a[i - 1]) % 1234567;
        }

        return a[n];
    }
}