package programmers.Lv_0;

import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
    }
    public static int[] solution(String my_string) {
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
//        my_string = my_string.replaceAll("[a-z]", "");
//        int[] a = new int[my_string.length()];
//        for (int i = 0; i < my_string.length(); i++) {
//            a[i] = my_string.charAt(i) - '0';
//        }
//        Arrays.sort(a);
//        return a;
    }
}
