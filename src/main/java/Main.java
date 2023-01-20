import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(9, 2, 1, 3)));
    }
}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = denom1 * numer2 + numer1 * denom2;
        answer[1] = denom1 * denom2;
        int a = Math.max(denom1, denom2);
        int b = Math.min(denom1, denom2);
        if (a % b == 0) {
            answer[0] = answer[0] / (a / b);
            answer[1] = answer[1] / (a / b);
        }
        return answer;
    }
}