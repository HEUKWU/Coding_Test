package programmers.Lv_1.콜라_문제;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
        System.out.println(solution(3, 1, 20));
    }

    static int solution(int a, int b, int n) {
        int sum = 0;

        while(n >= a) {
            sum += (n / a) * b;
            int c = n % a;

            n = (n / a) * b + c;
        }

        return sum;
    }
}
