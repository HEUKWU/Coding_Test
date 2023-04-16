package programmers.Lv_0.저주의_숫자3;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(40));
    }


    public static int solution(int n) {
        int a = 1;
        for (int i = 1; true; i++, a++) {
            while (a % 3 == 0 || String.valueOf(a).contains("3")) {
                a++;
            }
            if (i == n) {
                break;
            }
        }

        return a;
    }
}
