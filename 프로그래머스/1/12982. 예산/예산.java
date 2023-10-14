import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++, count++) {
            sum += d[i];
            if (sum > budget) {
                break;
            }
        }

        return count;
    }
}