class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int length = number.length() - k;
        int start = 0;

        for (int i = 0; i < length; i++) {
            int max = 0;
            for (int j = start; j < k + sb.length() + 1; j++) {
                int a = number.charAt(j) - '0';
                if (max < a) {
                    max = a;
                    start = j + 1;
                }
            }

            sb.append(max);
        }

        return sb.toString();
    }
}