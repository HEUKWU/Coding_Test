package programmers.Lv_1.부족한_금액_계산하기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    static long solution(int price, int money, int count) {
        long result = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (sum > money) {
            return sum - money;
        }

        return result;
    }
}