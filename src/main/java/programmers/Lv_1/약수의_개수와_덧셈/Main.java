package programmers.Lv_1.약수의_개수와_덧셈;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(13, 17));
    }
}

class Solution {
    public int solution(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            if (count(i)) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        return sum;
    }

    static boolean count(int i) {
        int count = 0;

        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }

        return count % 2 == 0;
    }
}
