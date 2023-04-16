package programmers.Lv_0.문제;

import java.util.Arrays;

public class p35 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
    }

    public static String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
