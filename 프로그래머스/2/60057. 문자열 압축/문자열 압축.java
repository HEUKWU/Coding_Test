class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int step = 1; step <= s.length() / 2; step++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, step);
            int count = 1;

            for (int i = step; i < s.length(); i += step) {
                StringBuilder sub = new StringBuilder();

                for (int j = i; j < i + step; j++) {
                    if (j < s.length()) {
                        sub.append(s.charAt(j));
                    }
                }

                if (prev.equals(sub.toString())) {
                    count++;
                } else {
                    compressed.append((count >= 2) ? count + prev : prev);
                    sub = new StringBuilder();

                    for (int j = i; j < i + step; j++) {
                        if (j < s.length()) {
                            sub.append(s.charAt(j));
                        }
                    }
                    prev = sub.toString();
                    count = 1;
                }
            }

            compressed.append((count >= 2) ? count + prev : prev);
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}