class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int a = section[0];
        for (int i = 0; i < section.length; i++) {
            if (a <= section[i]) {
                a = section[i] + m;
                count++;
            }
        }
        return count;
    }
}