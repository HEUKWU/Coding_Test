package programmers.Lv_1.크기가_작은_부분문자열;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

    static int solution(String t, String p) {
        int count = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            StringBuilder sb = new StringBuilder().append(t.charAt(i));
            for (int j = 0, k = i + 1; j < p.length() - 1; j++, k++) {
                sb.append(t.charAt(k));
            }
            if (Long.parseLong(sb.toString()) <= Long.parseLong(p)) {
                count++;
            }
        }

        return count;
    }
}
