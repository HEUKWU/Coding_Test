package programmers.Lv_1.문자열_내림차순으로_배치하기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s) {
//        String u = "";
//        String l = "";
//        for (int i = 0; i < s.length(); i++) {
//            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
//                l += s.charAt(i);
//            } else {
//                u += s.charAt(i);
//            }
//        }
//        String[] us = u.split("");
//        String[] ls = l.split("");
//        Arrays.sort(us);
//        Arrays.sort(ls);
//        StringBuilder ub = new StringBuilder();
//        for (String i : us) {
//            ub.append(i);
//        }
//        StringBuilder lb = new StringBuilder();
//        for (String i : ls) {
//            lb.append(i);
//        }
//        return String.valueOf(lb.reverse().append(ub.reverse()));
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
