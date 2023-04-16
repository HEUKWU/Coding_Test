package programmers.Lv_0.문제;

import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {
        int[] a = {1, 9, 3, 10, 13, 5};
        System.out.println(Arrays.toString(solution(5, a)));
    }

    public static int[] solution(int n, int[] numlist) {
        int count = 0;
        int j = 0;
        int[] a = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
                a[j] = numlist[i];
                j++;
            }
        }
        return Arrays.copyOfRange(a, 0, count);
    }
}
