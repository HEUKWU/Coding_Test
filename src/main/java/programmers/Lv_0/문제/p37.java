package programmers.Lv_0.문제;

public class p37 {
    public static void main(String[] args) {

    }
    public static int solution(String my_string) {
        String[] s = my_string.split(" ");
        int a = Integer.parseInt(s[0]);
        for (int i = 1; i < s.length; i += 2) {
            if (s[i].equals("+")) {
                a += Integer.parseInt(s[i + 1]);
            } else {
                a -= Integer.parseInt(s[i + 1]);
            }
        }
        return a;
    }
}
