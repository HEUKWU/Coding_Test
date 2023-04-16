package programmers.Lv_0.문제;

public class p17 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int a = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    a++;
                }
            }
            if (a >= 3) {
                count++;
            }
            a = 0;
        }
        return count;
    }
}
