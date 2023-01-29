package programmers.Lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class p14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(29)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}
