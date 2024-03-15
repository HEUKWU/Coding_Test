import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int end = targets[0][1];
        answer++;

        for (int[] target : targets) {
            if (target[0] >= end) {
                end = target[1];
                answer++;
            }
        }

        return answer;
    }
}