package programmers.Lv_0.문제;

import java.util.Arrays;

public class p16 {
    public static void main(String[] args) {
        System.out.println(solution("Python"));
    }

    public static String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        my_string = new String(c);
        return my_string;
    }
}
