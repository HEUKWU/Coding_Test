package programmers.Lv_1.명예의_전당_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 100, 20, 150, 1, 100, 200};
        int[] b = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(solution(3, a)));
        System.out.println(Arrays.toString(solution(4, b)));
    }

    static int[] solution(int k, int[] score) {
        int[] a = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
            } else {
                if (list.get(0) < score[i]) {
                    list.set(0, score[i]);
                }
            }
            Collections.sort(list);
            a[i] = list.get(0);
        }

        return a;
    }
}
