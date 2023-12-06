class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        for (int j = 0; j < number.length() - k; j++) {
            int max = 0;
            for (int l = i; l <= k + j; l++) {
                int n = number.charAt(l) - '0';
                if (n > max) {
                    max = n;
                    i = l + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}