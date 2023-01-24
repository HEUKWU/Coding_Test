package programmers.Lv_0;

import java.util.Arrays;

public class p20 {
    public static void main(String[] args) {
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
        String[] a = before.split("");
        String[] b = after.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b) ? 1 : 0;
    }
}
