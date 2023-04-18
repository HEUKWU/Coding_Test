package programmers.Lv_0.다항식_더하기;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("1 + 1"));
    }

    public static String solution(String polynomial) {
        String[] s = polynomial.split(" ");
        int x = 0;
        int y = 0;

        for (String a : s) {
            if (a.contains("x")) {
                if (a.charAt(0) == 'x') {
                    x += 1;
                } else {
                    x += Integer.parseInt(a.replaceAll("x", ""));
                }
            } else if (!a.equals("+")) {
                y += Integer.parseInt(a);
            }
        }

        String i = "";
        String j = "";

        if (x != 0) {
            i += x == 1 ? "x" : x + "x";
        }
        if (y != 0) {
            j += x != 0 ? " + " + y : y;
        }

        return i + j;
    }
}
