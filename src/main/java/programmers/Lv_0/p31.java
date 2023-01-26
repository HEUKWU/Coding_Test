package programmers.Lv_0;

import java.util.Arrays;

public class p31 {
    public static void main(String[] args) {
        System.out.println(solution("1a2b3c4d123Z"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] a = my_string.split("[a-zA-Z]");
        for (String s : a) {
            answer += !s.isEmpty() ? Integer.parseInt(s) : 0;
        }
        return answer;
    }
}
