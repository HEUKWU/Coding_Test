package programmers.Lv_1.숫자_문자열과_영단어;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            s = s.replace(arr[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
