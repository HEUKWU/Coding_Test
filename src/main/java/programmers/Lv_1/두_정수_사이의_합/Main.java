package programmers.Lv_1.두_정수_사이의_합;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }
    static long solution(int a, int b) {
        long sum = 0;
        int x;
        int y;

        if (a < b) {
            x = a;
            y = b;
        } else {
            y = a;
            x = b;
        }

        for (int i = x; i <= y; i++) {
            sum += i;
        }

        return sum;
    }
}