class Solution {
    public String solution(String s) {
        String[] split = s.toLowerCase().split("");

        StringBuilder sb = new StringBuilder();
        boolean b = true;
        for (String string : split) {
            sb.append(b ? string.toUpperCase() : string);
            b = string.equals(" ");
        }

        return sb.toString();
    }
}