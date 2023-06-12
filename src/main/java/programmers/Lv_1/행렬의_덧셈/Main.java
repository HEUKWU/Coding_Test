package programmers.Lv_1.행렬의_덧셈;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1}, {2}};
        int[][] b = {{3}, {4}};
        System.out.println(Arrays.deepToString(solution(a, b)));
    }

    static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] a = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                a[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return a;
    }
}