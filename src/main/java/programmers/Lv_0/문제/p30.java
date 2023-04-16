package programmers.Lv_0.문제;

import java.util.ArrayList;
import java.util.Arrays;

public class p30 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
    }

    public static int[] solution(int n) {
        int a = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        a++;
                    }
                }
                if (a == 2) {
                    list.add(i);
                }
                a = 0;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
