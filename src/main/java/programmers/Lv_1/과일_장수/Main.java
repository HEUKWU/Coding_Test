package programmers.Lv_1.과일_장수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 2, 3, 1};
        int[] b = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(3, 4, a));
        System.out.println(solution(4, 3, b));
    }

    static int solution(int k, int m, int[] score) {
        int sum = 0;
        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--) {
            if ((score.length - i) % m == 0) {
                sum += score[i] * m;
            }
        }

        return sum;
    }
}
