class Solution {
    public int[] solution(String s) {
        int count = 0;
        int length = 0;

        while (!s.equals("1")) {
            String bS = s.replaceAll("0", "");
            length += s.length() - bS.length();

            s = Integer.toBinaryString(bS.length());
            count++;
        }

        return new int[]{count, length};
    }
}