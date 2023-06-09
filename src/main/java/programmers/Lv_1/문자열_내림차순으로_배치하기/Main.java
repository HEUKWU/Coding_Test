package programmers.Lv_1.문자열_내림차순으로_배치하기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("bcaA"));
    }
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();

        Arrays.sort(c);

        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }

        return sb.toString();
    }
}
