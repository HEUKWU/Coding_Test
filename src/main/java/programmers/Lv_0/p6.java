package programmers.Lv_0;

public class p6 {
    public static void main(String[] args) {
        System.out.println(solution("pfqallllabwaoclk", 2));
    }
    public static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for (int i = code; i <= cipher.length(); i += code) {
            answer.append(cipher.charAt(i - 1));
        }
        return answer.toString();
    }
}
