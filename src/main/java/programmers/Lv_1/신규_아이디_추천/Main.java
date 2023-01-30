package programmers.Lv_1.신규_아이디_추천;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("=.="));
    }

    public static String solution(String s) {
        char[] c = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char value : c) {
            if ('a' <= value && value <= 'z' || '0' <= value && value <= '9' || value == '-' || value == '_' ||
            value == '.') {
                sb.append(value);
            }
        }
        String answer = sb.toString();

        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        if (answer.length() > 0) {
            if (answer.charAt(0) == '.') {
                answer = answer.substring(1);
            }
        }

        if (answer.length() > 0) {
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        if (answer.length() == 0) {
            answer = "a";
        }
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        char cs = answer.charAt(answer.length() - 1);
        if (answer.length() <= 2) {
            while (answer.length() <= 2) {
                answer += cs;
            }
        }
        return answer;
    }
}
