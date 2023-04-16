package programmers.Lv_0.문제;

import java.util.*;

public class p27 {
    public static void main(String[] args) {
        System.out.println(solution("abdc"));
    }

    public static String solution(String s) {
        String[] arr = s.split("");
        StringBuilder answer = new StringBuilder();
        int a = 0;
        Arrays.sort(arr);
        for (String value : arr) {
            for (String item : arr) {
                if (Objects.equals(value, item)) {
                    a++;
                }
            }
            if (a == 1) {
                answer.append(value);
            }
            a = 0;
        }
        return answer.toString();
    }
}
