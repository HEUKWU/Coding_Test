package programmers.Lv_0.문제;

import java.util.Arrays;

public class p24 {
    public static void main(String[] args) {
        int[] a = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(a)));
    }

    public static int[] solution(int[] emergency) {
        int[] a = emergency.clone();
        int[] answer = new int[emergency.length];
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (emergency[i] == a[j]) {
                    answer[i] = a.length - j;
                }
            }
        }
        return answer;
    }
}
