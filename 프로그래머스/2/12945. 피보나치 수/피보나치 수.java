class Solution {
    public int solution(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int[] a = new int[n + 1];
        a[1] = 1;
        a[2] = 1;

        for (int i = 3; i <= n; i++) {
            a[i] = (a[i - 1] + a[i - 2]) % 1234567;
        }

        return a[n];
    }
}