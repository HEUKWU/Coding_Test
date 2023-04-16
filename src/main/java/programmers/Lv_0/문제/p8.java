package programmers.Lv_0.문제;

import java.util.Arrays;

public class p8 {
    public static void main(String[] args) {
        int[] a = {9, 10, 11, 8};
        System.out.println(Arrays.toString(solution(a)));
    }
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                a = i;
            }
        }
        answer[0] = max;
        answer[1] = a;
        return answer;
//        int[] answer = new int[2];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > answer[0]) {
//                answer[0] = array[i];
//                answer[1] = i;
//            }
//        }
//        return answer;
    }
}
