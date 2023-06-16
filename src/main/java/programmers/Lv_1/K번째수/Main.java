package programmers.Lv_1.K번째수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(a, b)));
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] a = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = commands[i][0] - 1, k = 0; j <= commands[i][1] - 1; j++, k++) {
                a[k] = array[j];
            }

            Arrays.sort(a);

            answer[i] = a[commands[i][2] - 1];
        }

        return answer;
    }
}
