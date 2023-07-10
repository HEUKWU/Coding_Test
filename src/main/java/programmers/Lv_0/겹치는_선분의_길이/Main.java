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
        int[] ints = new int[201];
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                ints[j + 100]++;
            }
        }

        int count = 0;

        for (int i : ints) {
            if (i >= 2) {
                count++;
            }
        }

        return count;
    }
}
