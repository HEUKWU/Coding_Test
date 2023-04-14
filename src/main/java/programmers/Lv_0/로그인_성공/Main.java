package programmers.Lv_0.로그인_성공;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] a = {"meosseugi", "1234"};
        String[][] b = {
                {"rardss", "123"},
                {"yyoom", "1234"},
                {"meosseugi", "1234"}
        };

        System.out.println(solution(a, b));
    }
    public static String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbMap = new HashMap<>();
        for (String[] s : db) {
            dbMap.put(s[0], s[1]);
        }

        if (!dbMap.containsKey(id_pw[0])) {
            return "fail";
        }

        if (dbMap.get(id_pw[0]).equals(id_pw[1])) {
            return "login";
        } else {
            return "wrong pw";
        }
    }
}
