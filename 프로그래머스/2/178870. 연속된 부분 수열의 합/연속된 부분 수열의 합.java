class Solution {
    public int[] solution(int[] sequence, int k) {
        int a = 0;
        int b = 0;
        int sum = 0;
        int left = 0;
        int size = Integer.MAX_VALUE;
        for (int right = 0; right < sequence.length; right++) {
            sum += sequence[right];

            while (sum > k) {
                sum -= sequence[left];
                left++;
            }

            if (sum == k) {
                if (right - left < size) {
                    size = right - left;
                    a = left;
                    b = right;
                }
            }
        }

        return new int[]{a, b};
    }
}