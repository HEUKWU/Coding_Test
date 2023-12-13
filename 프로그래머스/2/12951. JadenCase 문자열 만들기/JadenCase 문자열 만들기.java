class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String a : arr) {
            if (a.length() != 0) {
                String first = a.substring(0, 1).toUpperCase();
                sb.append(first);
                String remain = a.substring(1).toLowerCase();
                sb.append(remain);
            }
            sb.append(" ");
        }

        if (s.endsWith(" ")) {
            return sb.toString();
        }

        return sb.substring(0, sb.toString().length() - 1);
    }
}