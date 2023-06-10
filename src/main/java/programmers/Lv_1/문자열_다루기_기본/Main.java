package programmers.Lv_1.문자열_다루기_기본;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("1234"));
    }

    static boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        char[] c = s.toCharArray();

        for (char a : c) {
            if (!('0' <= a && a <= '9')) {
                return false;
            }
        }
        return true;
    }
}