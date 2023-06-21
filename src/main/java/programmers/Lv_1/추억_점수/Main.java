package programmers.Lv_1.추억_점수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = {"may", "kein", "kain", "radi"};
        int[] b = {5, 10, 1, 3};
        String[][] c = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        System.out.println(Arrays.toString(solution(a, b, c)));
    }

    static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] sum = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < photo.length; j++) {
                int a = 0;
                for (int k = 0; k < photo[j].length; k++) {
                    if (name[i].equals(photo[j][k])) {
                        sum[j] += yearning[i];
                    }
                }
            }
        }

        return sum;
    }
}
