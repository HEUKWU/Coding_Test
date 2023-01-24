package programmers.Lv_0;

import java.util.Arrays;

public class p21 {
    public static void main(String[] args) {
        int[] a = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        System.out.println(Arrays.deepToString(solution(a, 3)));
    }
    public static int[][] solution(int[] num_list, int n) {
        int[][] a = new int[num_list.length / n][n];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = num_list[b++];
            }
        }
        return a;
    }
}
