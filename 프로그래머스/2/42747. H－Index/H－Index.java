import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            int min = Math.min(citations[i], n - i);
            max = Math.max(max, min);
        }

        return max;
    }
}