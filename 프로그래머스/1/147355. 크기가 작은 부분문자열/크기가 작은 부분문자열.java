class Solution {
    public int solution(String t, String p) {
        long a = Long.parseLong(p);
        int length = t.length() - p.length();
        int count = 0;

        for (int i = 0; i <= length; i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= a) {
                count++;
            }
        }

        return count;
    }
}