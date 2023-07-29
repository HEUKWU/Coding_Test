package programmers.Lv_0.대문자와_소문자;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if ('a' <= a && a <= 'z') {
                sb.append((a + "").toUpperCase());
            } else {
                sb.append((a + "").toLowerCase());
            }
        }
        return sb.toString();
    }
}
