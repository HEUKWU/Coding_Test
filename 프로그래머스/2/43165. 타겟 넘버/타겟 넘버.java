class Solution {

    private int[] numbers;
    private int target;
    private int count = 0;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return count;
    }

    private void dfs(int depth, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                count++;
            }
        } else {
            dfs(depth + 1, sum + numbers[depth]);
            dfs(depth + 1, sum - numbers[depth]);
        }
    }
}