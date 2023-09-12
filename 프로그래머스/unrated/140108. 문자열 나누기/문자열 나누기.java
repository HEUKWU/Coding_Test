class Solution {
    public int solution(String s) {
        int count = 0;
        char a = s.charAt(0);
        int j = 0, k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j == k) {
                count++;
                a = s.charAt(i);
            }
            if (s.charAt(i) == a) {
                j++;
            } else {
                k++;
            }
        }

        return count;
    }
}