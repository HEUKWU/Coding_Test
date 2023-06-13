package programmers.Lv_1.l3진법_뒤집기;

public class Main {
    public static void main(String[] args) {

    }

    static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        sb.reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}