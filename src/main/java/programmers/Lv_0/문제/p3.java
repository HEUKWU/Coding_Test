package programmers.Lv_0.문제;

import java.util.Arrays;

public class p3 {
    public static void main(String[] args) {
        String[] s = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(solution(s, 1)));
    }
    public static String[] solution(String[] strings, int n) {
        String[] a = new String[strings.length];
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < strings[i].length(); j++) {
                s.append(strings[i].charAt(j));
            }
            a[i] = s.toString();
            s = new StringBuilder();
        }
        return a;
    }
}
