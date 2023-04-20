package programmers.Lv_0.연속된_수의_합;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
    }

    public static int[] solution(int num, int total) {
        int[] a = new int[num];
        int sum = num * (num + 1) / 2;
        int x = (total - sum) / num;

        for (int i = 1; i <= num; i++) {
            a[i - 1] = x + i;
        }
        return a;
    }
}
