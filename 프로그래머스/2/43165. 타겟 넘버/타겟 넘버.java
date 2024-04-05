class Solution {

    private int[] numbers;
    private int target;

    private int answer = 0;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    private void dfs(int num, int depth) {
        if (depth == numbers.length) {
            if (num == target) {
                answer++;
            }
            return;
        }

        dfs(num + numbers[depth], depth + 1);
        dfs(num - numbers[depth], depth + 1);
    }
}