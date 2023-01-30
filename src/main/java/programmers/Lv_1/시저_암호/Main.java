package programmers.Lv_1.시저_암호;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if ('A' <= c[i] && c[i] <= 'Z') {
                c[i] += n;
                if (c[i] > 90) {
                    c[i] -= 26;
                }
            } else if ('a' <= c[i] && c[i] <= 'z'){
                c[i] += n;
                if (c[i] > 122) {
                    c[i] -= 26;
                }
            }
        }
        return new String(c);
    }
}
