package programmers.Lv_0.문자열_정렬하기_1;

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if ('0' <= a && a <= '9') {
                sb.append(a);
            }
        }
        int[] answer = new int[sb.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sb.toString().charAt(i) - '0';
        }
        Arrays.sort(answer);

        return answer;
    }
}
