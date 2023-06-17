package programmers.Lv_1.l2016년;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(1, 5));
    }

    static String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for (int i = 0; i < a - 1; i++) {
            sum += date[i];
        }

        sum += (b - 1);
        return day[sum % 7];
    }
}
