package programmers.Lv_0.문제;

import java.util.Arrays;

public class p12 {
    public static void main(String[] args) {
        int[] a = {0, -31, 24, 10, 1, 9};
        System.out.println(solution(a));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max((numbers[numbers.length - 1] * numbers[numbers.length - 2]), (numbers[0] * numbers[1]));
    }
}
