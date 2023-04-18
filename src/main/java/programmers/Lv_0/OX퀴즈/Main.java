package programmers.Lv_0.OX퀴즈;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(a)));
    }

    public static String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            if (split[1].equals("+")) {
                result[i] = Integer.parseInt(split[0]) + Integer.parseInt(split[2]) == Integer.parseInt(split[4]) ? "O" : "X";
            } else {
                result[i] = Integer.parseInt(split[0]) - Integer.parseInt(split[2]) == Integer.parseInt(split[4]) ? "O" : "X";
            }
        }
        return result;
    }
}
