class Solution {
    public int[] solution(String s) {
        int[] count = new int[2];

        while (true) {
            count[1] += s.length();
            s = s.replaceAll("0", "");
            count[1] -= s.length();

            s = Integer.toBinaryString(s.length());
            count[0]++;

            if (s.equals("1")) {
                return count;
            }
        }
    }
}