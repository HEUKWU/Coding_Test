package programmers.Lv_1.실패율;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(5, a)));
    }

    static int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            double a = 0;
            double b = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i <= stages[j]) {
                    a++;
                }
                if (i == stages[j]) {
                    b++;
                }
            }
            if (a == 0 && b == 0) {
                a = 1;
            }
            map.put(i, b / a);
        }

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            double max = -1;
            int b = 0;
            for (Integer key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    b = key;
                }
            }
            a[i] = b;
            map.remove(b);
        }
        return a;
    }
}
