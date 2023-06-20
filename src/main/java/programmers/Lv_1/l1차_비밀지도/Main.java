package programmers.Lv_1.l1차_비밀지도;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {9, 20, 28, 18, 11};
        int[] b = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(5, a, b)));

        int[] c = {46, 33, 33 ,22, 31, 50};
        int[] d = {27, 56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution(6, c, d)));
    }

    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            String s1 = method(i, n, arr1);
            String s2 = method(i, n, arr2);
            String answer = "";

            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                    answer += "#";
                } else {
                    answer += " ";
                }
            }

            a[i] = answer;
        }
        return a;
    }

    static String method(int i, int n, int[] arr) {
        String s = Integer.toBinaryString(arr[i]);
        return "0".repeat(n - s.length()) + s;
    }
}