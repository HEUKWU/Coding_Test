import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
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