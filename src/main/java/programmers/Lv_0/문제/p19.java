package programmers.Lv_0.문제;

public class p19 {
    public static void main(String[] args) {
        System.out.println(solution(24));
    }

    public static int solution(int n) {
        int sum = 1;
        for (int i = 1; true; i++) {
            sum *= i;
            if (sum == n) {
                sum = i;
                break;
            } else if (sum > n) {
                sum = i - 1;
                break;
            }
        }
        return sum;
//        int sum = 1;
//        int i = 1;
//        while (sum <= n) {
//            i++;
//            sum *= i;
//        }
//        return i - 1;
    }
}
