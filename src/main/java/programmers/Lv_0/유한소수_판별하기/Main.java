package programmers.Lv_0.유한소수_판별하기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(12, 21));
    }

    public static int solution(int a, int b) {
        int max = 0;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }

        int c = b / max;

        while (c != 1) {
            if (c % 2 == 0) {
                c /= 2;
            } else if (c % 5 == 0) {
                c /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
}
