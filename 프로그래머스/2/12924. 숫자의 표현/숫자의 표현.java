class Solution {
    public int solution(int n) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum > n) {
                    sum = 0;
                    break;
                }
                if (sum == n) {
                    count++;
                    sum = 0;
                    break;
                }
            }
        }

        return count;
    }
}