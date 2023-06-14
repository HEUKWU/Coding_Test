package programmers.Lv_1.최소직사각형;

public class Main {
    public static void main(String[] args) {
    }

    static int solution(int[][] sizes) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < sizes.length; i++) {
            a = Math.max(a, Math.max(sizes[i][0], sizes[i][1]));
            b = Math.max(b, Math.min(sizes[i][0], sizes[i][1]));
        }

        return a * b;
    }
}