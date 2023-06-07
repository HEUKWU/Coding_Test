package programmers.Lv_1.가운데_글자_가져오기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() % 2 == 0) {
            sb.append(s.charAt(s.length() / 2 - 1));
        }
        return sb.append(s.charAt(s.length() / 2)).toString();
    }
}
