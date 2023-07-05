package programmers.Lv_1.체육복;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {1, 3, 5};
        System.out.println(solution(5, a, b));

        int[] c = {2, 4};
        int[] d = {3};
        System.out.println(solution(5, c, d));

        int[] e = {3};
        int[] f = {1};
        System.out.println(solution(3, e, f));
    }

    static int solution(int n, int[] lost, int[] reserve) {
        int count = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        for (int i : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (i + 1 == reserve[j] || i - 1 == reserve[j]) {
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
