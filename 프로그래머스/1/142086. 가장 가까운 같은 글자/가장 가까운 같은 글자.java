class Solution {
    public int[] solution(String s) {
        int[] a = new int[s.length()];

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1, k = 1; j < a.length; j++, k++) {
                if (s.charAt(i) == s.charAt(j)) {
                    a[j] = k;
                }
            }
            if (a[i] == 0) {
                a[i] = -1;
            }
        }

        return a;
    }
}