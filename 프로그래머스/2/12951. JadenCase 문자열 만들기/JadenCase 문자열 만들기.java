class Solution {
    public String solution(String s) {
        String[] arr = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        boolean isBlank = true;

        for (String a : arr) {
            sb = isBlank ? sb.append(a.toUpperCase()) : sb.append(a);
            isBlank = a.equals(" ");
        }

        return sb.toString();
    }
}