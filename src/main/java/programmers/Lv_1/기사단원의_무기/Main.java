package programmers.Lv_1.기사단원의_무기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
        System.out.println(solution(10, 3, 2));
    }

    static int solution(int number, int limit, int power) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }

            sum += count > limit ? power : count;
        }

        return sum;
    }
}
