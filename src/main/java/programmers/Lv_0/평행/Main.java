package programmers.Lv_0.평행;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(solution(a));

        int[][] b = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(solution(b));
    }

    static int solution(int[][] dots) {
        double ax = dots[0][0];
        double bx = dots[1][0];
        double cx = dots[2][0];
        double dx = dots[3][0];

        double ay = dots[0][1];
        double by = dots[1][1];
        double cy = dots[2][1];
        double dy = dots[3][1];

        if ((ax - bx) / (ay - by) == (cx - dx) / (cy - dy) || (ax - cx) / (ay - cy) == (bx - dx) / (by - dy)) {
            return 1;
        }

        return 0;
    }
}
