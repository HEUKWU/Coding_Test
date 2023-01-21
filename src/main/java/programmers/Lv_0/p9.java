package programmers.Lv_0;

import java.util.Arrays;

public class p9 {
    public static void main(String[] args) {
        int[] a = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(solution(a, "left")));
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] a = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (direction.equals("right")) {
                if (i == 0) {
                    a[0] = numbers[numbers.length - 1];
                } else {
                    a[i] = numbers[i - 1];
                }
            } else {
                if (i == numbers.length - 1) {
                    a[i] = numbers[0];
                } else {
                    a[i] = numbers[i + 1];
                }
            }
        }
        return a;
    }
}
