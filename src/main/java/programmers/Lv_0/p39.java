package programmers.Lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class p39 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(a)));
    }

    public static int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                count[0]++;
            }
            if (answers[i] == b[i % 8]) {
                count[1]++;
            }
            if (answers[i] == c[i % 10]) {
                count[2]++;
            }
        }
        int max = 0;
        for (int j : count) {
            max = Math.max(max, j);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                list.add(i + 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
