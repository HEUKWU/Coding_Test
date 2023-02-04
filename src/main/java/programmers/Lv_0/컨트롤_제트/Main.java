package programmers.Lv_0.컨트롤_제트;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        String[] sp = s.split(" ");
        int sum = 0;
        for (int i = 0; i < sp.length; i++) {
            if (sp[i].equals("Z")) {
                sum -= Integer.parseInt(sp[i - 1]);
            } else {
                sum += Integer.parseInt(sp[i]);
            }
        }
        return sum;
    }
}
