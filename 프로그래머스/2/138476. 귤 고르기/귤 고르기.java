import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int[] a = new int[10000001];
        for (int i : tangerine) {
            a[i]++;
        }

        Arrays.sort(a);

        int count = 0;
        for (int i = a.length - 1; i > 0; i--) {
            k -= a[i];
            count++;
            if (k <= 0) {
                break;
            }
        }

        return count;
    }
}