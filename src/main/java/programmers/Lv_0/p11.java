package programmers.Lv_0;

public class p11 {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    public static int solution(int n) {
        int a = 0;
        int i = 6;
        while (true) {
            if (i % n == 0) {
                a = i;
                break;
            }
            i += 6;
        }
        return a / 6;
    }
}
