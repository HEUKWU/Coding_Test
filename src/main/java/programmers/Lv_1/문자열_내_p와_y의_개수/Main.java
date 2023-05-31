package programmers.Lv_1.문자열_내_p와_y의_개수;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                a++;
            } else if (s.charAt(i) == 'y') {
                a--;
            }
        }
        return a == 0;
    }
}