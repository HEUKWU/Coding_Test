package programmers.Lv_0.문자열_밀기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
    }

    public static int solution(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            if (B.equals(A)) {
                return i;
            }
            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
        }
        return -1;
    }
}
