class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        int j = 0;
        for (long i = left; i <= right; i++, j++) {
            int a = (int) (i / n);
            int b = (int) (i % n);

            answer[j] = Math.max(a, b) + 1;
        }

        return answer;
    }
}