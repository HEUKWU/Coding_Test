package programmers.Lv_1.소수_찾기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }

    public static int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean a = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                count++;
            }
        }
        return count;
    }
}