package programmers.Lv_1.이상한_문자_만들기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            a = j % 2 == 0 ? a.toUpperCase() : a.toLowerCase();
            j++;

            if (s.charAt(i) == ' ') {
                j = 0;
            }

            sb.append(a);
        }

        return sb.toString();
    }
}