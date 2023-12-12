class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int i = 0;
        int count = 0;
        for (int a : ingredient) {
            stack[i] = a;

            if (a == 1 && i >= 3 && stack[i - 1] == 3 && stack[i - 2] == 2 && stack[i - 3] == 1) {
                i -= 3;
                count++;
            } else {
                i++;
            }
        }

        return count;
    }
}