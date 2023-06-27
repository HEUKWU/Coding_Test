package programmers.Lv_1.소수_찾기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
    }

    static int solution(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            count = count(i, count);
        }

        return count;
    }

    static int count(int a, int count) {
        boolean c = true;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                c = false;
                break;
            }
        }

        return c ? count + 1 : count;
    }
}