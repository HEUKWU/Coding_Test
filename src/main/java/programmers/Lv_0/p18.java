package programmers.Lv_0;

import java.util.*;

public class p18 {
    public static void main(String[] args) {
        System.out.println(solution("We are the world"));
    }

    public static String solution(String my_string) {
        String[] s = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(s));
        StringBuilder sb = new StringBuilder();
        for (String value : set) {
            sb.append(value);
        }
        return sb.toString();

//        return String.join("", set);
    }
}
