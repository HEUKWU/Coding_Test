package programmers.Lv_0.문제;

import java.util.Arrays;

public class p38 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(a, b)));
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int a = 0;
        int b = 0;
        int[] rank = new int[2];
        for (int lotto : lottos) {
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    a++;
                }
            }
            if (lotto == 0) {
                b++;
            }
        }
        b += a;
        rank[0] = 7 - b;
        rank[1] = 7 - a;
        if (rank[0] > 6) {
            rank[0] = 6;
        }
        if (rank[1] > 6) {
            rank[1] = 6;
        }
        return rank;
    }
}
