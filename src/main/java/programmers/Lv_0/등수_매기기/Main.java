package programmers.Lv_0.등수_매기기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {80, 70},
                {90, 50},
                {40, 70},
                {50, 80}
        };
        System.out.println(Arrays.toString(solution(a)));
    }

    public static int[] solution(int[][] score) {
        float[] avg = new float[score.length];
        for (int i = 0; i < avg.length; i++) {
            avg[i] = (score[i][0] + score[i][1]);
        }

        int[] answer = new int[avg.length];
        for (int i = 0; i < avg.length; i++) {
            int a = 1;
            for (float v : avg) {
                if (avg[i] < v) {
                    a++;
                }
                answer[i] = a;
            }
        }

        return answer;
    }
}
