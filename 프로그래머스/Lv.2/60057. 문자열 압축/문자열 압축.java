class Solution {
    public int solution(String s) {
        int result = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int level = 1;
            String str = s.substring(0, i);
            StringBuilder sb = new StringBuilder();

            for (int j = i; j <= s.length(); j += i) {
                String tmp = s.substring(j, Math.min(i + j, s.length()));

                if (str.equals(tmp)) {
                    level++;
                } else {
                    sb.append(level != 1 ? level : "").append(str);
                    str = tmp;
                    level = 1;
                }
            }

            sb.append(str);
            result = Math.min(result, sb.length());
        }

        return result;
    }
}