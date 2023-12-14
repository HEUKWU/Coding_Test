class Solution {
    public int[] solution(String s) {
        int[] count = new int[2];

        while (true) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }
            count[0]++;
            count[1] += s.length() - sum;

            s = Integer.toBinaryString(sum);
            if (s.equals("1")) {
                return count;
            }
        }
    }
}