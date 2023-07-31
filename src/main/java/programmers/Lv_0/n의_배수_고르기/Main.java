package programmers.Lv_0.n의_배수_고르기;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
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
