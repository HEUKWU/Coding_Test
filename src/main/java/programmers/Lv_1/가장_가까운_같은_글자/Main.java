package programmers.Lv_1.가장_가까운_같은_글자;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("foobar")));
    }

    static int[] solution(String s) {
        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = -1;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1, k = 1; j < a.length; j++, k++) {
                if (s.charAt(i) == s.charAt(j)) {
                    a[j] = k;
                    break;
                }
            }
        }

        return a;
    }
}
