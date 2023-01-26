package programmers.Lv_0;

public class p32 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(solution(a, 3));
    }

    public static int solution(int[] numbers, int k) {
        int[] a = new int[k * 2];
        for (int i = 0; i < a.length; i++) {
            a[i] = i % numbers.length + 1;
        }
        return a[k * 2 - 2];
    }
}
