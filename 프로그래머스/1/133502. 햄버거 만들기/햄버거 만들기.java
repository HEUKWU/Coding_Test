class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];

        int count = 0;
        int j = 0;
        for (int i : ingredient) {
            stack[j++] = i;

            if (j >= 4 && stack[j - 1] == 1) {
                if (stack[j - 2] == 3) {
                    if (stack[j - 3] == 2) {
                        if (stack[j - 4] == 1) {
                            count++;
                            j -= 4;
                        }
                    }
                }
            }
        }

        return count;
    }
}