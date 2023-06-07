package programmers.Lv_1.수박수박수박수박수박수;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String a = "수";
        String b = "박";

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sb.append(a);
            } else {
                sb.append(b);
            }
        }

        return sb.toString();
    }
}