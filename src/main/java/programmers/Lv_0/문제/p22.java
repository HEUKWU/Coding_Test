package programmers.Lv_0.문제;

import java.util.Arrays;

public class p22 {
    public static void main(String[] args) {
        int[] a = {10, 13, 11};
        System.out.println(solution(a, 12));
    }

    public static int solution(int[] array, int n) {
        Arrays.sort(array);
        int a = 100;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) < a) {
                a = Math.abs(array[i] - n);
                b = array[i];
            }
        }
        return b;
    }
}
