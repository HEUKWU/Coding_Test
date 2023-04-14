package programmers.Lv_0.외계어_사전;

public class Main {
    public static void main(String[] args) {
        String[] a = {"p", "o", "s"};
        String[] b = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(a, b));
    }

    public static int solution(String[] spell, String[] dic) {
        for (String value : dic) {
            int count = 0;
            for (String s : spell) {
                if (value.contains(s)) {
                    count++;
                }
                if (count == spell.length) {
                    return 1;
                }
            }
        }
        return 2;
    }
}
