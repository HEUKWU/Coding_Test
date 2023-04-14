package programmers.Lv_0.직사각형_넓이_구하기;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1},
                {2, 1},
                {2, 2},
                {1, 2}
        };
        System.out.println(solution(a));
    }
    public static int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x = 0;
        int y = 0;
        for (int i = 1; i < dots.length; i++) {
            if (x1 == dots[i][0]) {
                x = Math.abs(dots[0][1] - dots[i][1]);
            }
            if (y1 == dots[i][1]) {
                y = Math.abs(dots[0][0] - dots[i][0]);
            }
        }
        return x * y;
    }
}
