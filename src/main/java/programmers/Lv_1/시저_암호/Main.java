package programmers.Lv_1.시저_암호;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if ('A' <= a && a <= 'Z') {
                a += n;
                if (a > 'Z') {
                    a -= 26;
                }
            } else if ('a' <= a && a <= 'z') {
                a += n;
                if (a > 'z') {
                    a -= 26;
                }
            }

            sb.append(a);
        }

        return sb.toString();
    }
}
