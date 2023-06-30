package programmers.Lv_1.로또의_최고_순위와_최저_순위;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {44, 1, 0, 0, 31, 25};
        int[] aa = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(a, aa)));

        int[] b = {0, 0, 0, 0, 0, 0};
        int[] bb = {38, 19, 20, 40, 15, 25};
        System.out.println(Arrays.toString(solution(b, bb)));

        int[] c = {45, 4, 35, 20, 3, 9};
        int[] cc = {20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(solution(c, cc)));
    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] a = {-1, 6, 5, 4, 3, 2, 1};
        int count = 0;
        int zCount = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zCount++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }

        int[] scores = {6, 6};

        for (int i = 0; i < a.length; i++) {
            if (zCount + count == a[i]) {
                scores[0] = i;
            }
            if (count == a[i]) {
                scores[1] = i;
            }
        }

        return scores;
    }
}
