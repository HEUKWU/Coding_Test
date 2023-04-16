package programmers.Lv_0.문제;

import java.util.Arrays;

public class p40 {
    public static void main(String[] args) {
        String[] a = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(solution(a, 2)));
    }

    public static String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        return strings;
    }
}
