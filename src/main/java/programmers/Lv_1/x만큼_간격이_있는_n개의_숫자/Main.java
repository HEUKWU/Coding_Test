package programmers.Lv_1.x만큼_간격이_있는_n개의_숫자;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] a = new long[n];
        long j = 0;
        for (int i = 0; i < n; i++) {
            a[i] = j += x;
        }
        return a;
    }
}
