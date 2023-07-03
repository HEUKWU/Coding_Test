package programmers.Lv_0.겹치는_선분의_길이;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{0, 1}, {2, 5}, {3, 9}};
        System.out.println(solution(a));

        int[][] b = {{-1, 1}, {1, 3}, {3, 9}};
        System.out.println(solution(b));

        int[][] c = {{0, 5}, {3, 9}, {1, 10}};
        System.out.println(solution(c));
    }

    static int solution(int[][] lines) {
        int[] arr = new int[201];
        int count = 0;

        for (int[] line : lines) {
            int a = line[0] + 100;
            int b = line[1] + 100;
            while (a < b) {
                if (++arr[a++] == 2) {
                    count++;
                }
            }
        }

        return count;
    }
}
