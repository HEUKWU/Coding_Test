package programmers.Lv_0;

public class p33 {
    public static void main(String[] args) {
        System.out.println(solution(-3, -3));
    }

    public static long solution(int a, int b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        long sum = 0;
        for (long i = min; i <= max; i++) {
            sum += i;
            System.out.print(i);
        }
        System.out.println();
        return a == b ? a : sum;
    }
}
