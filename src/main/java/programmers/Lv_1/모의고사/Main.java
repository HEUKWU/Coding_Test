package programmers.Lv_1.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(a)));
        System.out.println(Arrays.toString(solution(b)));
    }

    static int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int ac = 0;
        int bc = 0;
        int cc = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i % answers.length] == a[i % 5]) {
                ac++;
            }
            if (answers[i % answers.length] == b[i % 8]) {
                bc++;
            }
            if (answers[i % answers.length] == c[i % 10]) {
                cc++;
            }
        }

        int[] score = {ac, bc, cc};
        int max = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
