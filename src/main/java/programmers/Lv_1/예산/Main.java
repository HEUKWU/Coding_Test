package programmers.Lv_1.예산;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 4};
        System.out.println(solution(a, 9));
    }

    static int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++, count++) {
            sum += d[i];
            if (sum > budget) {
                break;
            }
        }

        return count;
    }
}
